package cierzo.model.objects

/**
 * Clase que representa un/unos artista/s de canciones
 * @param id: ID del autor
 * @param nombre: Nombre del autor
 * @param bio: Biografia del autor
 * @param albums: Albumes del autor
 * @param imagenURL: Direccion de la imagen
 * @param numAlbum: Numero de albums que tiene el autor
 */
class Author(
    var id: String,
    var nombre: String,
    var bio: String,
    var albums: Array<Album>,
    var imagenURL: String,
    var numAlbum: Int
) {}