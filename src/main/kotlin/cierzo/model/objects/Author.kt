package cierzo.model.objects

import cierzo.model.ItemArrayConverter
import io.swagger.client.ApiClient
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
    val id: String,
    val name: String,
    val bio: String,
    val albums: List<Album>,
    val imageURL: String
) {
    constructor(authorItem: AuthorItem) : this(
            id = authorItem.id,
            name = authorItem.name,
            bio = authorItem.bio,
            albums = ItemArrayConverter.albumFromAlbum(authorItem.albums),
            imageURL = "${ApiClient.basePath}/authors/${authorItem.id}/image"
    )
}