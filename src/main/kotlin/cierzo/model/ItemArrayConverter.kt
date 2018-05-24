package cierzo.model

import cierzo.model.objects.Playlist
import cierzo.model.objects.Song
import cierzo.model.objects.User
import io.swagger.client.model.*

object ItemArrayConverter {
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
}