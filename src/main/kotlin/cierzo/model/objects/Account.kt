package cierzo.model.objects

/**
 * Clase que representa un Usuario de la aplicacion
 * @param id: ID del usuario
 * @param username: Username del usuario
 * @param biografia: Pequeña descripcion del usuario
 * @param mail: Mail del usuario
 * @param friends: Lista de Amigos
 * @param pass: Contraseña (DE MOMENTO SIN CIFRAR)
 * @param tiempoUltimaSesion: Timestamp del ultimo inicio de sesion
 *
 */
class Account(
    var id: String,
    var username: String,
    var biografia: String,
    var mail: String,
    var friends: Array<Friend>,
    var pass: String,
    var tiempoUltimaSesion: Int
) {}