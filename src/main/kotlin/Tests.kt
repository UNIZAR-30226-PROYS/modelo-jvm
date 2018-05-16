import cierzo.model.APIConnector
import cierzo.model.objects.SongQueue
import io.swagger.client.api.AdminsApi
import io.swagger.client.api.PublicApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.SongItem
import io.swagger.client.ApiException
import io.swagger.client.model.AccountItem
import io.swagger.client.model.LoginItem
import io.swagger.client.model.SignUpItem


/*fun testProfile(id: String = "1") {
    try {
        var profileItem = publicApi.getProfile(id)
        System.out.println("Resultado: " + profileItem.name)
    } catch (e: ApiException) {
        System.err.println("Exception when calling PublicApi#createAccount")
        e.printStackTrace()
    }
}

fun testSignup() {
    var signupItem = SignUpItem()
    signupItem.mail = "correo2@dominio.com"
    signupItem.name = "Usuario2"
    signupItem.pass = "123"
    signupItem.username = "usuarioGuay2"
    try {
        var accountItem: AccountItem = publicApi.createAccount(signupItem)
        System.out.println("Registrado como: " + accountItem.name)
    } catch (e: ApiException) {
        System.err.println("Exception (Signup)")
        e.printStackTrace()
    }
}

fun testLogin() {
    var loginItem = LoginItem()
    loginItem.mail = "correo2@dominio.com"
    loginItem.pass = "123"
    try {
        var accountItem: AccountItem = publicApi.login(loginItem)
        System.out.println("Sesión iniciada como: " + accountItem.name)
    } catch (e: ApiException) {
        System.err.println("Exception (Login)")
        e.printStackTrace()
    }
}

fun testLogout() {
    try {
        var accountItem = usersApi.logout()
        System.out.println("Sesión cerrada")
    } catch (e: ApiException) {
        System.err.println("Exception (Logout)")
        e.printStackTrace()
    }
}*/

fun testSongQueue(id:Int) {
    // Get Playlists
    try {
        SongQueue.loadPlaylist(APIConnector.getPlaylist(id) ?: throw Exception("Playlist is null"))
        System.out.println("Playlist loaded successfully on Song Queue. Size: " + SongQueue.playingSongs.size)
    } catch (e: ApiException) {
        when (e.code) {
            404 -> System.out.println("Error 404: No se ha encontrado la lista de ID $id.")
            // Error 400: No puede darse este caso, se requiere Int.
        }
    } catch (e: Exception) {
        System.err.println("Exception (testSongQueue)")
        e.printStackTrace()
    }
}

fun testCollectionSongQueue() {
    // Playlist correcta
    testSongQueue(1)
    // Playlist que no existe
    testSongQueue(99)
    // SongQueue: Avanzar
    System.out.println("NEXT: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    // SongQueue: Retroceder
    System.out.println("PREV: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)

    // SongQueue: Avanzar (con repeat)
    SongQueue.repeat = true
    System.out.println("REPEAT NEXT: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    // SongQueue: Retroceder (con repeat)
    System.out.println("REPEAT PREV: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    SongQueue.repeat = false

    // SongQueue: Saltar al index
    SongQueue.jumpToIndex(0)

    // SongQueue: Avanzar (con random)
    SongQueue.toggleRandom()
    System.out.println("RANDOM NEXT: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    // SongQueue: Retroceder (con random)
    System.out.println("RANDOM PREV: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)

    // SongQueue: Avanzar (sin random)
    SongQueue.toggleRandom()
    System.out.println("RANDOM NEXT: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getNextSong()?.name)
    // SongQueue: Retroceder (sin random)
    System.out.println("RANDOM PREV: Empezamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
    System.out.println("Estamos en " + SongQueue.actualSongIndex + " que es la canción " + SongQueue.playingSongs[SongQueue.actualSongIndex].name)
    System.out.println("Saltamos a " + SongQueue.getPreviousSong()?.name)
}

fun main(args : Array<String>) {
    testCollectionSongQueue()
}