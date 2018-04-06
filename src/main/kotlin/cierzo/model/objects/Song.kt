package cierzo.model.objects

/**
 * Clase que representa una playlist de canciones
 * @param id: ID de la cancion
 * @param nombre: Nombre de la cancion
 * @param autor: Autor de la cancion
 * @param album: Album al que pertenece la cancion
 * @param duracion: Duracion de la cancion en seugndos
 * @param genero: Gener de la cancion
 * @param imagenURL: Ruta de la imagen de la cancion
 * @param fileURL: Ruta del fichero de la cancion
 *
 */
class Song(
    var id: String,
    var nombre: String,
    var autor: Author,
    var album: Album,
    var duracion: Int,
    var genero: String,
    var imagenURL: String,
    var fileURL: String
){
}