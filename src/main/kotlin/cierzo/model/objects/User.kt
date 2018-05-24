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
    var id: String,
    var username: String,
    var name: String,
    var bio: String,
    private val accountItem: AccountItem?,
    private var profileItem: ProfileItem?) {

    constructor(accountItem: AccountItem) : this(
        id = accountItem.id,
        username = accountItem.username,
        name = accountItem.name,
        bio = accountItem.bio,
        accountItem = accountItem,
        profileItem = null)

    constructor(friendItem: FriendItem) : this(
        id = friendItem.id,
        username = friendItem.username,
        name = friendItem.name,
        bio = friendItem.bio,
        accountItem = null,
        profileItem = null)

    constructor(profileItem: ProfileItem) : this(
        id = profileItem.id,
        username = profileItem.username,
        name = profileItem.name,
        bio = profileItem.bio,
        accountItem = null,
        profileItem = profileItem)

    fun getFriends(): List<User> {
        if (accountItem != null) {
            return ItemArrayConverter.userFromFriend(accountItem.friends)
        } else if (profileItem != null) {
            return ItemArrayConverter.userFromFriend(profileItem!!.friends)
        } else {
            profileItem = APIConnector.getProfileItem(id)
            return ItemArrayConverter.userFromFriend(profileItem!!.friends)
        }
    }

    fun getPlaylists(): List<Playlist> {
        if (accountItem != null) {
            return ItemArrayConverter.playlistFromPlaylist(accountItem.playlists)
        } else if (profileItem != null) {
            return ItemArrayConverter.playlistFromPlaylist(profileItem!!.playlists)
        } else {
            profileItem = APIConnector.getProfileItem(id)
            return ItemArrayConverter.playlistFromPlaylist(profileItem!!.playlists)
        }
    }
}