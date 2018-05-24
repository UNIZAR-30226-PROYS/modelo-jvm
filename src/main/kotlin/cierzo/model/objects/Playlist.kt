package cierzo.model.objects

import cierzo.model.ItemArrayConverter
import io.swagger.client.model.PlaylistItem
import org.threeten.bp.LocalDate

/**
 * Clase que representa una playlist de canciones
 * @param id: ID de la playlist
 * @param songs: Canciones que contiene la playlist
 * @param name: Nombre de la playlist
 * @param idOwner: ID del dueño de la playlist
 * @param description: Pequeña descripcion de la playlist
 * @param date: Fecha de creacion de la playlist
 * @param imagenURL: Ruta de la imagen de la playlist
 *
 */
class Playlist(
    var id: String,
    var songs: MutableList<Song>,
    var name: String,
    var idOwner: String,
    var description: String,
    var date: LocalDate?,
    var imagenURL: String
) {

    constructor(playlistItem: PlaylistItem): this(playlistItem.id, ItemArrayConverter.songFromSongs(playlistItem.songs), playlistItem.name, playlistItem.ownerID,
            playlistItem.description, playlistItem.creationDate, "")
}