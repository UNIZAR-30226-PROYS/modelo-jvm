package cierzo.model.objects

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
    var songs: Array<Song>,
    var nombre: String,
    var idAutor: String,
    var nombreAutor: String,
    var imagenURL: String,
    var desc: String,
    var fecha: String
){}