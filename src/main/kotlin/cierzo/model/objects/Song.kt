package cierzo.model.objects

import cierzo.model.APIConnector
import io.swagger.client.model.SongItem
import java.io.File

/**
 * Clase que representa una playlist de canciones
 * @param id: ID de la cancion
 * @param name: Nombre de la cancion
 * @param authorID: Autor de la cancion
 * @param albumID: Album al que pertenece la cancion
 * @param length: Duracion de la cancion en seugndos
 * @param genre: Gener de la cancion
 * @param imageURL: Ruta de la imagen de la cancion
 * @param fileURL: Ruta del fichero de la cancion
 *
 */
class Song (
    var id: String,
    var name: String,
    var authorID: String,
    var authorName: String,
    var albumID: String,
    var albumName: String,
    var length: String,
    var genre: List<String>,
    var imageURL: String,
    var fileURL: String
) {

    // TODO: Cambiar las URL de debug por las que propocione la API
    constructor(songItem: SongItem) : this(songItem.id, songItem.name, songItem.authorID, songItem.albumName,
            songItem.albumID, songItem.albumName, songItem.lenght, songItem.genre,
            "http://files.jenesaispop.com/wp-content/uploads/2015/11/amaral-nocturnal.jpg",
            "https://www.hrupin.com/wp-content/uploads/mp3/testsong_20_sec.mp3")

    // TODO: Implementar estos métodos en APIConnector.
    /*fun getAuthor(): Author {
        return APIConnector.getAuthor(authorID)
    }

    fun getAlbum(): Album {
        return APIConnector.getAlbum(albumID)
    }

    fun getImageFile(): File {
        return APIConnector.getSongImage(id)
    }

    fun getFile(): File {
        return APIConnector.getSongFile(id)
    }*/
}
