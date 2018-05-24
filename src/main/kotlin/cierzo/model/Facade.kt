package cierzo.model

import cierzo.model.objects.Song
import cierzo.model.objects.User
import io.swagger.client.ApiException

fun login(login: String, pass: String): Boolean {
    try {
        APIConnector.login(login, pass)
        return true
    } catch (e: ApiException) {
        throw e
    } catch (e: Exception) {
        throw e
    }
}

fun logout(): Boolean {
    try {
        APIConnector.logout()
        return true
    } catch (e: ApiException) {
        throw e
    } catch (e: Exception) {
        throw e
    }
}

fun searchUsers(name: String = "", username: String = "", skip: Int = 1, limit: Int = 1): List<User> {
    return try {
        ItemArrayConverter.userFromProfile(APIConnector.searchProfiles(name, username, skip, limit))
    } catch (e: ApiException) {
        throw e
    }
}

fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 1, limit: Int = 1): List<Song> {
    return try {
        ItemArrayConverter.songFromSongs(APIConnector.searchSongs(name, author, genre, skip, limit))
    } catch (e: ApiException) {
        throw e
    }
}