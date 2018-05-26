package cierzo.model

import cierzo.model.objects.*
import io.swagger.annotations.Api
import io.swagger.client.ApiClient
import io.swagger.client.ApiException
import io.swagger.client.api.AdminsApi
import io.swagger.client.api.PublicApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.*
import sun.java2d.cmm.Profile
import java.net.CookieHandler
import kotlin.math.sign


internal class APIConnector private constructor(){
    private var apiClient: ApiClient = ApiClient()
    private var publicApi: PublicApi
    private var adminsApi: AdminsApi
    private var usersApi: UsersApi

    companion object {
        private val instance = APIConnector()

        fun getInstance(): APIConnector {
            return instance
        }
    }

    init {
        publicApi = PublicApi(apiClient)
        adminsApi = AdminsApi(apiClient)
        usersApi = UsersApi(apiClient)
    }

    /**
     * Return a list (mutable) from server of songs (as SongItem) that match with the parameters.
     */
    internal fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 0,
                    limit: Int = 1): MutableList<SongItem> {
        return try {
            publicApi.searchSong(name, author, genre, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Return a list (mutable) from server of user profiles (as ProfileItem) that match with the parameters.
     */
    internal fun searchProfiles(name: String = "", username: String = "", skip: Int = 0, limit: Int = 1)
            : MutableList<ProfileItem> {
        return try {
            publicApi.searchProfiles(name, username, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Return a list (mutable) from server of playlists (as PlaylistItem) that match with the parameters.
     */
    internal fun searchPlaylists(name: String = "", ownerUsername: String = "", skip: Int = 0, limit: Int = 1)
            : MutableList<PlaylistItem> {
        return try {
            publicApi.searchPlaylist(name, ownerUsername, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Return a list (mutable) from server of albums (as AlbumItem) that match with the parameters.
     */
    internal fun searchAlbums(name: String = "", author: String = "", skip: Int = 0, limit: Int = 1):
            MutableList<AlbumItem> {
        return try {
            publicApi.searchAlbum(name, author, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Return a list (mutable) from server of authors (as AuthorItem) that match with the parameters.
     */
    internal fun searchAuthors(name: String = "", skip: Int = 0, limit: Int = 1):
            MutableList<AuthorItem> {
        return try {
            publicApi.searchAuthors(name, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Return a playlist (as Playlist) from server with a specific id.
     */
    internal fun getPlaylist(playlistID: Int): Playlist {
        try {
            return Playlist(publicApi.getPlaylist(playlistID.toString()))
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Do log in and add the user to UserLogged.
     */
    internal fun login(mail: String, pass: String) {
        var loginItem: LoginItem = LoginItem()
        loginItem.mail = mail
        loginItem.pass = pass

        if (!UserLogged.getInstance().isLogged()) {
            try {
                var accountItem: AccountItem = publicApi.login(loginItem)
                UserLogged.getInstance().onLogin(accountItem)
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("An user is already logged")
        }
    }

    /**
     * Do log out and remove the user from UserLogged.
     */
    internal fun logout() {
        if (UserLogged.getInstance().isLogged()) {
            try {
                usersApi.logout()
                UserLogged.getInstance().onLogout()
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("No user logged")
        }
    }

    /**
     * Register a new account on server
     */
    internal fun signup(mail: String, name: String, username: String, pass: String) {
        if (!UserLogged.getInstance().isLogged()) {
            try {
                var signUpItem: SignUpItem = SignUpItem()
                signUpItem.mail = mail
                signUpItem.username = username
                signUpItem.pass = pass
                signUpItem.name = name
                publicApi.createAccount(signUpItem)
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("A user is already logged")
        }
    }

    /**
     * Get from server a profile (as ProfileItem) with a specific id.
     */
    internal fun getProfileItem(profileId: String): ProfileItem {
        return publicApi.getProfile(profileId)
    }

    /**
     * Get from server a user (as User) with a specific id.
     */
    internal fun getUser(userId: String): User {
        return User(publicApi.getProfile(userId))
    }

    /**
     * Get from server a author (as Author) with a specific id.
     */
    internal fun getAuthor(authorId: String): Author {
        return Author(publicApi.getAuthor(authorId))
    }

    /**
     * Get from server a album (as Album) with a specific id.
     */
    internal fun getAlbum(albumId: String): Album {
        return Album(publicApi.getAlbum(albumId))
    }

    /**
     * Delete from server a playlist with a specific id.
     */
    internal fun removePlaylist(playlistId: String) {
        usersApi.deletePlaylist(playlistId)
    }

    /**
     * Add to the server a new playlist with a specific name and description.
     */
    internal fun newPlaylist(name: String, desc: String) {
        var playlistItem = PlaylistItemNew()
        playlistItem.name = name
        playlistItem.description = desc
        usersApi.addPlaylist(playlistItem)
    }

    /**
     * Make the user logged to follow other user with a specific id.
     */
    internal fun newFriend(friendId: String) {
        usersApi.followProfile(friendId)
    }

    /**
     * Make the user logged to unfollow other user with a specific id.
     */
    internal fun removeFriend(friendId: String) {
        usersApi.unfollowProfile(friendId)
    }

    /**
     * Add on the server a new song with a specefic id to a existing playlist with a specific id.
     */
    internal fun addSong(playlistId: String, songId: String) {
        usersApi.addPlaylistSong(playlistId, songId)
    }

    /**
     * Delete from server a song with a specefic id of a existing playlist with a specific id.
     */
    internal fun removeSong(playlistId: String, songId: String) {
        usersApi.deletePlaylistSong(playlistId, songId)
    }

    /**
     * Saves the current session on the server
     */
    internal fun saveSession(playlistId: String, second: String, songId: String) {
        var session: SessionItem = SessionItem()
        session.playlistID = playlistId
        session.second = second
        session.songID = songId
        usersApi.saveSession(session)
    }

    /**
     * Get the saved session from the server in a Set with playlistID (0), second (1) and songID (2).
     */
    internal fun getSession(): Set<String> {
        var sessionItem: SessionItem = usersApi.restoreSession()
        return setOf(sessionItem.playlistID, sessionItem.second, sessionItem.songID)
    }

    /**
     * Edit the basic information of a user on the server.
     */
    internal fun editUserInfo(username: String, name: String, bio: String) {
        var accountItem: AccountItemUpdate = AccountItemUpdate()
        accountItem.bio = bio
        accountItem.name = name
        accountItem.username = username
        usersApi.updateAccount(accountItem)
    }

    /**
     * Edit the credentials of a user on the server.
     */
    internal fun editUserCredentials(mail: String, pass: String) {
        var loginItem: LoginItem = LoginItem()
        loginItem.mail = mail
        loginItem.pass = pass
        usersApi.updateAccountCredentials(loginItem)
    }

    /**
     * Edit the basic information of a playlist on the server.
     */
    internal fun editPlaylistInfo(playlistId: String, name: String, description: String) {
        var playlistItemNew: PlaylistItemNew = PlaylistItemNew()
        playlistItemNew.name = name
        playlistItemNew.description = description
        usersApi.updatePlaylist(playlistId, playlistItemNew)
    }
}