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

    constructor(songItem: SongItem) : this(
            id = songItem.id,
            name = songItem.name,
            authorID = songItem.authorID,
            authorName = songItem.authorName,
            albumID = songItem.albumID,
            albumName = songItem.albumName,
            length = songItem.lenght,
            genre = songItem.genre,
            imageURL = "http://localhost:8080/api/songs/${songItem.id}/image",
            fileURL = "http://localhost:8080/api/songs/${songItem.id}/file")


}
