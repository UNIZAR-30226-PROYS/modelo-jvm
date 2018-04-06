package cierzo.model

import io.swagger.client.infrastructure.ClientException
import io.swagger.client.infrastructure.ServerException
import io.swagger.client.models.PlaylistItem
import io.swagger.client.models.SongItem
import java.io.File

// TODO: Re-hacer la fachada una vez estén listos los objetos

/********************************************************************/
/**                        SONGS                                    */
/********************************************************************/

/**
 * Call the API to return the artist's song list
 * Param:
 * @param artist: Artist's songs
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchArtistsSongs(artist: String, pag: Int, limit: Int) : Array<SongItem?>? {
    return null

}

/**
 * Call the API to return the genre's song list
 * Param:
 * @param genre: Genre
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchGenresSongs(genre: String, pag: Int, limit: Int) : Array<SongItem?>? {
    return null
}

/**
 * Call the API to return the songs with the same name
 * Param:
 * @param name: Name of the song
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchSongsByName(name: String, pag: Int, limit: Int) : Array<SongItem?>? {
    return null
}

/**
 * Call the API to return information of a song
 * Param:
 * @param id: Identificator's songs
 */
fun fetchSongById(id: String) : SongItem? {
    return null
}

/**
 * Call the API to download the Song
 * Param:
 * @param songId: Song id
 */
/*fun fetchSongFile(songId: String): File? {
    val apiInstance = APIConnector.publicApi
    val songFile : File? =
        try {
            apiInstance.getSongFile(songId)
        } catch (e: ClientException) {
            println("4xx response calling PublicApi#getSongFile")
            e.printStackTrace()
            null
        } catch (e: ServerException) {
            println("5xx response calling PublicApi#getSongFile")
            e.printStackTrace()
            null
        }
    return songFile
}*/

/********************************************************************/
/**                        PLAYLISTS                                */
/********************************************************************/


/**
 * Call the API to return Playlist with the same name
 * Param:
 * @param name: Name's playlist
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchPlaylistByName(name: String, pag: Int, limit: Int) : Array<PlaylistItem>? {
    return null
}

/**
 * Call the API to return the owner list
 * Param:
 * @param owner: Owner lists
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchPlaylistByOwner(owner: String, pag: Int, limit: Int) : Array<PlaylistItem>? {
    return null
}

/**
 * Call the API to return the list with the same identifier
 * Param:
 * @param id: id's list
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchPlaylistById(id: String, pag: Int, limit: Int) : PlaylistItem? {
    return null
}

/**
 * Call the API to create a new Playlist
 * Param:
 * @param user: Owner of the playList
 * @param songList: song List
 * @param name: Name of the new playlist
 * @param description: Description of the new playlist
 */
fun createPlaylist(name: String, description: String) {

}

/**
 * Call the API to update a Playlist
 * Param:
 * @param id: Id's playlist
 * @param songList: song List
 * @param name: Name of the new playlist
 * @param description: Description of the new playlist
 */
fun updatePlaylist(id: String, songList: String, name: String, description: String) {

}

/**
 * Call the API to delete a Playlist
 * Param:<
 * @param id: Id's playlist
 */
fun deletePlaylist(id: String): Int? {
    return null
}

/**
 * Call the API to add a song in a Playlist
 * Param:
 * @param idList: Id's playlist
 * @param idSong: Id's song to add
 */
fun addSongToPlaylist(idList: String, idSong: String) {

}

/**
 * Call the API to delete a song in a Playlist
 * Param:
 * @param idList: Id's playlist
 * @param idSong: Id's song to delete
 */
fun deleteSongFromPlaylist(idList: String, idSong: String) {

}


/********************************************************************/
/**                        PROFILES                                 */
/********************************************************************/

/**
 * Call the API to return the Profiles with the same name
 * Param:
 * @param name: name profiles
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchProfileByName(name: String, pag: Int, limit: Int) : List<String>? {
    return null
}

/**
 * Call the API to return the Profiles with the same username
 * Param:
 * @param username: username's profile
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchProfileByUsername(username: String, pag: Int, limit: Int) : String? {
    return null
}

/**
 * Call the API to return the Profiles with the same id
 * Param:
 * @param id: id's profile
 * @param pag: View page number
 * @param limit: Maximum number of songs in the view
 */
fun fetchProfileById(id: String, pag: Int, limit: Int) : String? {
    return null
}

/**
 * Call the API to signup the new User
 * Param:
 * @param user: New user
 */
fun signupUser(user: String) {

}

/**
 * Call the API to login the User
 * Param:
 * @param user: user
 */
fun loginUser(user: String) {

}

/**
 * Call the API to logout the User
 * Param:
 * @param user: user
 */
fun logoutUser(user: String) {

}

/**
 * Call the API to follow one user
 * Param:
 * @param idUser: id's user
 */
fun followUser(idUser: String) {

}

/**
 * Call the API to unfollow one user
 * Param:
 * @param idUser: id's user
 */
fun unfollowUser(idUser: String) {

}

/**
 * Call the API to obtain details user
 * Param:
 * @param idUser: id's user
 */
fun myAccountInfo(idUser: String): String? {
    return null
}

/**
 * Call the API to update details user
 * Param:
 * @param idUser: id's user
 * @param user: New info
 */
fun updateAccountInfo(idUser: String, user: String) {

}

/**
 * Call the API to delete user
 * Param:
 * @param idUser: id's user
 */
fun deleteAccount(idUser: String) {

}

/**
 * Call the API to update credentials user
 * Param:
 * @param idUser: id's user
 * @param user: New info
 */
fun updateCredentialsAccount(idUser: String, user: String) {

}

/**
 * Call the API to obtain the moment of the last song playing
 * Param:
 * @param idUser: id's user
 */
fun fetchSongMoment(): String? {
    return null
}

/**
 * Call the API to save the moment of the last song playing
 * Param:
 * @param idUser: id's user
 * @param playList: Playlist that I was listening
 * @param song: Song that I was listening
 * @param time: Time's song that I was listening
 */
fun saveSongMoment(idUser: String, playList: String, song: String, time: Int) {

}



