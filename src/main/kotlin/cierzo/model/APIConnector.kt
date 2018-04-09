package cierzo.model

import io.swagger.client.apis.AdminsApi
import io.swagger.client.apis.PublicApi
import io.swagger.client.apis.UsersApi
import io.swagger.client.models.*
import io.swagger.client.infrastructure.*

object APIConnector {
    internal val publicApi: PublicApi = PublicApi()
    internal val adminsApi: AdminsApi = AdminsApi()
    internal val usersApi: UsersApi = UsersApi()

    fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 1,
                    limit: Int = 1): kotlin.Array<SongItem>? {
        return try {
            publicApi.searchSong(name, author, genre, skip, limit)
        } catch (e: ClientException) { // 4xx Error
            null
        } catch (e: ServerException) { // 5xx Error
            null
        }
    }

    fun getSongInfo(songID: String): SongItem? {
        return try {
            //publicApi.getSong(songID)
            SongItem("123456789","I Will Survive","03:05", "4567", "Gloria Gaynor",
                    "9876", "Allenrok", arrayOf("rock"))
        } catch (e: ClientException) { // 4xx Error
            null
        } catch (e: ServerException) { // 5xx Error
            null
        }
    }
}