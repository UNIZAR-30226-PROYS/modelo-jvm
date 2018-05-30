package cierzo.model

import cierzo.model.objects.*
import io.swagger.client.model.*

/**
 * A ser of functions used to convert lists of "objectItem" to lists of "object".
 * The name express first the name of the objects in the returned list and second the name of the objectItem.
 * Example: "songFromSongs" return a list of Song from a list of SongItem.
 */
internal object ItemArrayConverter {
    fun songFromSongs(songItems: MutableList<SongItem>): MutableList<Song> {
        var songList: MutableList<Song> = mutableListOf()
        for (songItem in songItems) {
            songList.add(Song(songItem))
        }
        return songList
    }

    fun userFromFriend(friendItems: MutableList<FriendItem>): MutableList<User> {
        var userList: MutableList<User> = mutableListOf()
        for (friendItem in friendItems) {
            userList.add(User(friendItem))
        }
        return userList
    }

    fun userFromProfile(profileItems: MutableList<ProfileItem>): MutableList<User> {
        var userList: MutableList<User> = mutableListOf()
        for (profileItem in profileItems) {
            userList.add(User(profileItem))
        }
        return userList
    }

    fun playlistFromPlaylist(playlistItems: MutableList<PlaylistItem>): MutableList<Playlist> {
        var playlistList: MutableList<Playlist> = mutableListOf()
        for (playlistItem in playlistItems) {
            playlistList.add(Playlist(playlistItem))
        }
        return playlistList
    }

    fun authorFromAuthor(authorItems: MutableList<AuthorItem>): MutableList<Author> {
        var authorList: MutableList<Author> = mutableListOf()
        for (authorItem in authorItems) {
            authorList.add(Author(authorItem))
        }
        return authorList
    }

    fun albumFromAlbum(albumItems: MutableList<AlbumItem>): MutableList<Album> {
        var albumList: MutableList<Album> = mutableListOf()
        for (albumItem in albumItems) {
            albumList.add(Album(albumItem))
        }
        return albumList
    }
}