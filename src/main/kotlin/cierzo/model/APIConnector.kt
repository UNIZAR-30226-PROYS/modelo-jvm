package cierzo.model

import cierzo.model.objects.Playlist
import io.swagger.client.ApiClient
import io.swagger.client.ApiException
import io.swagger.client.api.AdminsApi
import io.swagger.client.api.PublicApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.*
import java.net.CookieHandler



object APIConnector {
    internal var apiClient: ApiClient = ApiClient()
    internal var publicApi: PublicApi
    internal var adminsApi: AdminsApi
    internal var usersApi: UsersApi

    init {
        publicApi = PublicApi(apiClient)
        adminsApi = AdminsApi(apiClient)
        usersApi = UsersApi(apiClient)
    }

    fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 1,
                    limit: Int = 1): List<SongItem>? {
        return try {
            publicApi.searchSong(name, author, genre, skip, limit)
        } catch (e: ApiException) {
            null
        }
    }

    /**
     * Get a Playlist from the server.
     */
    fun getPlaylist(playlistID: Int): Playlist {
        try {
            return Playlist(publicApi.getPlaylist(playlistID.toString()))
        } catch (e: ApiException) {
            throw e
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