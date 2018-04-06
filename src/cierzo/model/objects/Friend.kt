package cierzo.model.objects

/**
 * Clase que representa un amigo en la aplicacion
 * @param id: ID del amigo
 * @param username: Username del amigo
 * @param nombre: Nombre del amigo
 * @param bio: Biografia del Amigo
 *
 */
class Friend(
    var id: String,
    var username: String,
    var nombre: String,
    var bio: String
) {}