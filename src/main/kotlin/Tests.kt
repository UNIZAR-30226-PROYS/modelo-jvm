import io.swagger.client.api.AdminsApi
import io.swagger.client.api.PublicApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.SongItem
import io.swagger.client.ApiException
import io.swagger.client.model.AccountItem
import io.swagger.client.model.SignUpItem



internal val publicApi: PublicApi = PublicApi()

fun testProfile(id: String = "1") {
    try {
        var profileItem = publicApi.getProfile(id)
        System.out.println("Resultado: " + profileItem.name)
    } catch (e: ApiException) {
        System.err.println("Exception when calling PublicApi#createAccount")
        e.printStackTrace()
    }

}

fun main(args : Array<String>) {
    testProfile()
}