import cierzo.model.APIConnector
import io.swagger.client.api.AdminsApi
import io.swagger.client.api.PublicApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.SongItem
import io.swagger.client.ApiException
import io.swagger.client.model.AccountItem
import io.swagger.client.model.LoginItem
import io.swagger.client.model.SignUpItem



internal var publicApi: PublicApi = PublicApi()
internal var usersApi: UsersApi = UsersApi()

fun init() {
    APIConnector.init()
    publicApi = APIConnector.publicApi
    usersApi = APIConnector.usersApi
}

fun testProfile(id: String = "1") {
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
}

fun testSongQueue() {
    // Get Playlists
}

fun main(args : Array<String>) {
    init()
    testProfile()
    testSongQueue()
}