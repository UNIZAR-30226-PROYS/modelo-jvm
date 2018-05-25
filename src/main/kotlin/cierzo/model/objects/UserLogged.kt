package cierzo.model.objects

import io.swagger.client.ApiException
import io.swagger.client.model.AccountItem

object UserLogged {
    var user: User? = null

    fun isLogged(): Boolean {
        return if (user == null) {
            false
        } else {
            true
        }
    }

    fun onLogin(accountItem: AccountItem) {
        user = User(accountItem)
    }

    fun onLogout() {
        user = null
    }

    fun getFavoritePlaylist(): Playlist {
        return if (isLogged()) {
            user!!.getPlaylists()[0]
        } else {
            throw Exception("User not logged")
        }
    }

    fun getAuthorsFromFavorite(): List<Author> {
        return if (isLogged()) {
            getFavoritePlaylist().getAuthors()
        } else {
            throw Exception("User not logged")
        }
    }

    fun getAlbumsFromFavorite(): List<Album> {
        return if (isLogged()) {
            getFavoritePlaylist().getAlbums()
        } else {
            throw Exception("User not logged")
        }
    }

    fun addToFavorite(song: Song): Boolean {
        if (isLogged()) {
            try {
                getFavoritePlaylist().addSong(song)
                return true
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("User not logged")
        }
    }

    fun removeFromFavorite(index: Int): Boolean {
        if (isLogged()) {
            try {
                getFavoritePlaylist().removeSong(index)
                return true
            } catch (e: ApiException) {
                throw e
            }
        } else {
            throw Exception("User not logged")
        }
    }

    fun newPlaylist(name: String, desc: String) {
        if (isLogged()) {
            user!!.newPlaylist(name, desc)
        } else {
            throw Exception("User not logged")
        }
    }

    fun deletePlaylist(index: Int) {
        if (isLogged()) {
            user!!.removePlaylist(index)
        } else {
            throw Exception("User not logged")
        }
    }

    fun newFriend(friendId: String) {
        if (isLogged()) {
            user!!.newFriend(friendId)
        } else {
            throw Exception("User not logged")
        }
    }
}