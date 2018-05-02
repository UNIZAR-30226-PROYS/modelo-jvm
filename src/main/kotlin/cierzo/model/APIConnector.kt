package cierzo.model

import io.swagger.client.ApiException
import io.swagger.client.api.AdminsApi
import io.swagger.client.api.PublicApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.*

object APIConnector {
    internal val publicApi: PublicApi = PublicApi()
    internal val adminsApi: AdminsApi = AdminsApi()
    internal val usersApi: UsersApi = UsersApi()

    fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 1,
                    limit: Int = 1): List<SongItem>? {
        return try {
            publicApi.searchSong(name, author, genre, skip, limit)
        } catch (e: ApiException) {
            null
        }
    }

    /*fun getSongInfo(songID: String): SongItem? {
        return try {
            //publicApi.getSong(songID)
            SongItem("123456789","I Will Survive","03:05", "4567", "Gloria Gaynor",
                    "9876", "Allenrok", listOf("rock"))
        } catch (e: ApiException) {
            null
        }
    }*/
}