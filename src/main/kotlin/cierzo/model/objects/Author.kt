package cierzo.model.objects

import cierzo.model.ItemArrayConverter
import io.swagger.client.model.AuthorItem

/**
 * Clase que representa un/unos artista/s de canciones
 * @param id: ID del autor
 * @param name: Nombre del autor
 * @param bio: Biografia del autor
 * @param albums: Albumes del autor
 * @param imageURL: Direccion de la imagen
 */
class Author(
    var id: String,
    var name: String,
    var bio: String,
    var albums: List<Album>,
    var imageURL: String
) {
    constructor(authorItem: AuthorItem) : this(
            id = authorItem.id,
            name = authorItem.name,
            bio = authorItem.bio,
            albums = ItemArrayConverter.albumFromAlbum(authorItem.albums),
            imageURL = "http://localhost:8080/api/authors/${authorItem.id}/image"
    )
}