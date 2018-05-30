package cierzo.model.objects

import cierzo.model.APIConnector
import io.swagger.client.ApiClient
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
    val id: String,
    val name: String,
    val authorID: String,
    val authorName: String,
    val albumID: String,
    val albumName: String,
    val length: String,
    val genre: List<String>,
    val imageURL: String,
    val fileURL: String
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
            imageURL = "${ApiClient.basePath}/songs/${songItem.id}/image",
            fileURL = "${ApiClient.basePath}/songs/${songItem.id}/file")

    override fun equals(other: Any?): Boolean {
        return if (other is Song) {
            if (other.id.equals(this.id)) {
                true
            } else {
                false
            }
        } else {
            false
        }
    }

}
