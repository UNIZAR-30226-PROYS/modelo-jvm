package cierzo.model.objects

/**
 * Clase que representa una playlist de canciones
 * @param id: ID de la playlist
 * @param songs: Canciones que contiene la playlist
 * @param nombre: Nombre de la playlist
 * @param idOwner: ID del dueño de la playlist
 * @param desc: Pequeña descripcion de la playlist
 * @param fecha: Fecha de creacion de la playlist
 * @param imagenURL: Ruta de la imagen de la playlist
 * @param duracionTotal: Tiempo total que dura la playlist
 *
 */
class Playlist(
    var id: String,
    var songs: Array<Song>,
    var nombre: String,
    var idOwner: String,
    var desc: String,
    var fecha: String,
    var imagenURL: String,
    var duracionTotal: Int
) {}