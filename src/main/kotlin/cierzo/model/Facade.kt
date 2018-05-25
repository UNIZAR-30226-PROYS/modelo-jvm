package cierzo.model

import cierzo.model.objects.Album
import cierzo.model.objects.Author
import cierzo.model.objects.Song
import cierzo.model.objects.User
import io.swagger.client.ApiException

/**
 * Log in using the mail and password of a user. If login is correct, the user data will be saved on UserLogged object.
 */
fun login(mail: String, pass: String): Boolean {
    try {
        APIConnector.login(mail, pass)
        return true
    } catch (e: ApiException) {
        throw e
    } catch (e: Exception) {
        throw e
    }
}

/**
 * Log out and remove th user data from UserLogged object.
 */
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

/**
 * Return a list (not mutable) from server of users (as User) that match with the parameters.
 */
fun searchUsers(name: String = "", username: String = "", skip: Int = 0, limit: Int = 1): List<User> {
    return try {
        ItemArrayConverter.userFromProfile(APIConnector.searchProfiles(name, username, skip, limit))
    } catch (e: ApiException) {
        throw e
    }
}

/**
 * Return a list (not mutable) from server of songs (as Song) that match with the parameters.
 */
fun searchSongs(name: String = "", author: String = "", genre: String = "", skip: Int = 0, limit: Int = 1): List<Song> {
    return try {
        ItemArrayConverter.songFromSongs(APIConnector.searchSongs(name, author, genre, skip, limit))
    } catch (e: ApiException) {
        throw e
    }
}

/**
 * Return a list (not mutable) from server of albums (as Album) that match with the parameters.
 */
fun searchAlbums(name: String = "", author: String = "", skip: Int = 0, limit: Int = 1): List<Album> {
    return try {
        ItemArrayConverter.albumFromAlbum(APIConnector.searchAlbums(name, author, skip, limit))
    } catch (e: ApiException) {
        throw e
    }
}

/**
 * Return a list (not mutable) from server of authors (as Author) that match with the parameters.
 */
fun searchAlbums(name: String = "", skip: Int = 0, limit: Int = 1): List<Author> {
    return try {
        ItemArrayConverter.authorFromAuthor(APIConnector.searchAuthors(name, skip, limit))
    } catch (e: ApiException) {
        throw e
    }
}