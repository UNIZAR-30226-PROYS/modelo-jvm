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



object APIConnector {
    private var apiClient: ApiClient = ApiClient()
    private var publicApi: PublicApi
    private var adminsApi: AdminsApi
    private var usersApi: UsersApi

    init {
        publicApi = PublicApi(apiClient)
        adminsApi = AdminsApi(apiClient)
        usersApi = UsersApi(apiClient)
    }

    internal fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 0,
                    limit: Int = 1): MutableList<SongItem> {
        return try {
            publicApi.searchSong(name, author, genre, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    internal fun searchProfiles(name: String = "", username: String = "", skip: Int = 0, limit: Int = 1)
            : MutableList<ProfileItem> {
        return try {
            publicApi.searchProfiles(name, username, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    internal fun searchPlaylists(name: String = "", ownerUsername: String = "", skip: Int = 0, limit: Int = 1)
            : MutableList<PlaylistItem> {
        return try {
            publicApi.searchPlaylist(name, ownerUsername, skip, limit)
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Get a Playlist from the server.
     */
    fun getPlaylist(playlistID: Int): Playlist {
        try {
            return Playlist(publicApi.getPlaylist(playlistID.toString()))
        } catch (e: ApiException) {
            throw e
        }
    }

    /**
     * Do login and create the profile
     */
    internal fun login(mail: String, pass: String) {
        var loginItem: LoginItem = LoginItem()
        loginItem.mail = mail
        loginItem.pass = pass

        if (!UserLogged.isLogged()) {
            try {
                var accountItem: AccountItem = publicApi.login(loginItem)
                UserLogged.onLogin(accountItem)
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("An user is already logged")
        }
    }

    internal fun logout() {
        if (UserLogged.isLogged()) {
            try {
                usersApi.logout()
                UserLogged.onLogout()
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("No user logged")
        }
    }

    internal fun getProfileItem(profileId: String): ProfileItem {
        return publicApi.getProfile(profileId)
    }

    internal fun getUser(userId: String): User {
        return User(publicApi.getProfile(userId))
    }

    internal fun removePlaylist(playlistId: String) {
        usersApi.deletePlaylist(playlistId)
    }

    internal fun newPlaylist(name: String, desc: String) {
        var playlistItem = PlaylistItemNew()
        playlistItem.name = name
        playlistItem.description = desc
        usersApi.addPlaylist(playlistItem)
    }

    internal fun newFriend(friendId: String) {
        usersApi.followProfile(friendId)
    }

    internal fun removeFriend(friendId: String) {
        usersApi.unfollowProfile(friendId)
    }

    internal fun addSong(playlistId: String, songId: String) {
        usersApi.addPlaylistSong(playlistId, songId)
    }

    internal fun removeSong(playlistId: String, songId: String) {
        usersApi.deletePlaylistSong(playlistId, songId)
    }

    internal fun getAuthor(authorId: String): Author {
        return Author(publicApi.getAuthor(authorId))
    }

    internal fun getAlbum(albumId: String): Album {
        return Album(publicApi.getAlbum(albumId))
    }

    /*fun getSongInfo(songID: String): SongItem? {
        return try {
            //publicApi.getSong(songID)
            SongItem("123456789","I Will Survive","03:05", "4567", "Gloria Gaynor",
                    "9876", "Allenrok", listOf("rock"))
        } catch (e: ApiException) {
            null
        }
    }*/
}