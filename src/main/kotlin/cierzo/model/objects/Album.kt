package cierzo.model.objects

import cierzo.model.ItemArrayConverter
import io.swagger.client.ApiClient.basePath
import io.swagger.client.model.AlbumItem
import org.threeten.bp.LocalDate

/**
 * Clase que representa un album de canciones
 * @param id: ID del album
 * @param songs: Lista de cnaciones que tiene el album
 * @param nombre: Nombre del album
 * @param idAutor: ID del autor del album
 * @param nombreAutor: Nombre del autor del album
 * @param imagenURL: Ruta de la imagen del album
 * @param desc: Descripcion del album
 * @param fecha: Fecha de la publicacion del album
 *
 */
class Album (
    var id: String,
    var songs: List<Song>,
    var name: String,
    var authorId: String,
    var authorName: String,
    var imageURL: String,
    var desc: String,
    var date: LocalDate
){
    constructor(albumItem: AlbumItem) : this(
            id = albumItem.id,
            songs = ItemArrayConverter.songFromSongs(albumItem.songs),
            name = albumItem.name,
            authorId = albumItem.authorID,
            authorName = albumItem.authorName,
            imageURL = "$basePath/albums/${albumItem.id}/image",
            desc = albumItem.description,
            date = albumItem.publishDate
    )
}