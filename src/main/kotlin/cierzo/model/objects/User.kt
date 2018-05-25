package cierzo.model.objects

import cierzo.model.APIConnector
import cierzo.model.ItemArrayConverter
import io.swagger.client.model.AccountItem
import io.swagger.client.model.FriendItem
import io.swagger.client.model.ProfileItem

/**
 * Clase que representa un Usuario y su perfil
 * @param id: ID del perfil
 * @param username: Username del perfil
 * @param name: Nombre del perfil
 * @param bio: Pequeña descripcion del perfil
 * @param friends: Lista de Amigos
 * @param playlists: Lista de Playlist
 * @param cuantosAmigos: Cantidad de amigos que tiene el perfil
 * @param cuantasPlaylist: Cantidad de playlist que tiene el perfils
 *
 */
class User(
    internal var id: String,
    internal var username: String,
    internal var name: String,
    internal var bio: String,
    private val accountItem: AccountItem?,
    private var profileItem: ProfileItem?) {

    private var storedPlaylists: MutableList<Playlist> = mutableListOf()
    private var storedFriends: MutableList<User> = mutableListOf()

    /**
     * Constructor with an AccountItem. Used when this user login.
     */
    constructor(accountItem: AccountItem) : this(
        id = accountItem.id,
        username = accountItem.username,
        name = accountItem.name,
        bio = accountItem.bio,
        accountItem = accountItem,
        profileItem = null)

    /**
     * Constructor with a FriendItem. Used when this user is created as friend of other.
     */
    constructor(friendItem: FriendItem) : this(
        id = friendItem.id,
        username = friendItem.username,
        name = friendItem.name,
        bio = friendItem.bio,
        accountItem = null,
        profileItem = null)

    /**
     * Constructor with a ProfileItem. Used when this user is created from a profile search.
     */
    constructor(profileItem: ProfileItem) : this(
        id = profileItem.id,
        username = profileItem.username,
        name = profileItem.name,
        bio = profileItem.bio,
        accountItem = null,
        profileItem = profileItem)

    /**
     * Return a list (not mutable) of all the friends (as User) of this user.
     * Can be called from the application.
     */
    public fun getFriends(): List<User> {
        if (storedFriends.isEmpty()) {
            storedFriends = if (accountItem != null) {
                ItemArrayConverter.userFromFriend(accountItem.friends)
            } else if (profileItem != null) {
                ItemArrayConverter.userFromFriend(profileItem!!.friends)
            } else {
                profileItem = APIConnector.getProfileItem(id)
                ItemArrayConverter.userFromFriend(profileItem!!.friends)
            }
        }
        return storedFriends.toList()
    }

    /**
     * Return a list (not mutable) of all the playlist (as Playlist) of this user.
     * Can be called from the application.
     */
    public fun getPlaylists(): List<Playlist> {
        if (storedPlaylists.isEmpty()) {
            storedPlaylists = if (accountItem != null) {
                ItemArrayConverter.playlistFromPlaylist(accountItem.playlists)
            } else if (profileItem != null) {
                ItemArrayConverter.playlistFromPlaylist(profileItem!!.playlists)
            } else {
                profileItem = APIConnector.getProfileItem(id)
                ItemArrayConverter.playlistFromPlaylist(profileItem!!.playlists)
            }
        }
        return storedPlaylists.toList()
    }

    /**
     * Update from the server the playlists of this user.
     * Used when the playlist id is unknown and need to be added or when the id is know, need to be removed, but unknown
     * the index.
     */
    private fun updateStoredPlaylists() {
        storedPlaylists = ItemArrayConverter.playlistFromPlaylist(
                APIConnector.searchPlaylists(ownerUsername = username))
    }

    /**
     * Update from the server the friends of this user.
     * Used when the friend id is unknown and need to be added or when the id is know, need to be removed, but unknown
     * the index.
     */
    private fun updateStoredFriends() {
        storedFriends = APIConnector.getUser(id).getFriends().toMutableList()
    }

    /**
     * Add a new playlist (on server) and reload the stored playlists.
     * User must be logged to use this.
     */
    internal fun newPlaylist(name: String, desc: String) {
        APIConnector.newPlaylist(name, desc)
        updateStoredPlaylists()
    }

    /**
     * Remove a playlist from server and stored playlists list using the index of the stored playlists list.
     * Use with caution: Procure that the list haven't been reorder.
     * User must be logged to use this.
     */
    internal fun removePlaylistAt(index: Int) {
        storedPlaylists[index].removeThis()
        storedPlaylists.removeAt(index)
    }

    /**
     * Remove a playlist from the server and reload the stored playlist list.
     * Use with caution: All user playlist must be downloaded again.
     * User must be logged to use this.
     */
    internal fun removePlaylist(playlistId: String) {
        APIConnector.removePlaylist(playlistId)
        updateStoredPlaylists()
    }

    /**
     * Add a new friend (on server) and download and save it profile (as User) on the stored friends list.
     * User must be logged to use this.
     */
    internal fun newFriend(friendId: String) {
        APIConnector.newFriend(friendId)
        storedFriends.add(User(APIConnector.getProfileItem(friendId)))
    }

    /**
     * Remove a friend from server and stored friends list using the index of the stored friends list.
     * Use with caution: Procure that the list haven't been reorder.
     * User must be logged to use this.
     */
    internal fun removeFriendAt(index: Int) {
        APIConnector.removeFriend(storedFriends[index].id)
        storedFriends.removeAt(index)
    }

    /**
     * Remove a friend from the server and reload the stored friends list.
     * Use with caution: All user data (including playlist, but they aren't updated) must be downloaded again.
     * User must be logged to use this.
     */
    internal fun removeFriend(friendId: String) {
        APIConnector.removeFriend(friendId)
        updateStoredFriends()
    }

    /**
     * Return the basic information of this user.
     * Can be used in the application.
     */
    public fun getInfo(): Set<String> {
        return setOf(id, username, name, bio)
    }

    /**
     * Edit the basic information of this user with the parameters.
     * User must be logged.
     */
    internal fun editInfo(username: String = this.username, name: String = this.name, bio: String = this.bio) {
        try {
            APIConnector.editUserInfo(username, name, bio)
            this.username = username
            this.name = name
            this.bio = bio
            } catch (e: Exception) {
            throw e
        }
    }

    /**
     * Edit the credentials of this user.
     * User must be logged.
     */
    internal fun editCredentials(mail: String, pass: String) {
        APIConnector.editUserCredentials(mail, pass)
    }
}