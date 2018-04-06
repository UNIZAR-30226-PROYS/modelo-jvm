package cierzo.model.objects

/**
 * Clase que representa un Perfil, visto desde el punto de red social ??????????????????????????????????????????????????
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
class Profile(
    var id: String,
    var username: String,
    var nombre: String,
    var bio: String,
    var friends: Array<Friend>,
    var playlists: Array<Playlist>,
    var cuantosAmigos: Int,
    var cuantasPlaylist: Int
) {}