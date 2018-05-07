package cierzo.model.objects

object SongQueue {
    var playingSongs: MutableList<Song> = mutableListOf()
    var actualSongIndex: Int = 0
    var repeat: Boolean = false

    /**
     * Return the last song played on this list.
     * If there aren't previous song, return the same.
     *
     */
    fun getPreviousSong(): Song {
        return if (actualSongIndex == 0) {
            playingSongs[actualSongIndex]
        } else {
            playingSongs[actualSongIndex--]
        }
    }

    /**
     * Return the next song to be played on this list.
     * If there aren't next song and repeat isn't active, return null.
     */
    fun getNextSong(): Song? {
        return if (actualSongIndex == playingSongs.lastIndex) {
            null
        } else {
            playingSongs[actualSongIndex++]
        }
    }

    /**
     * Randomize the next songs.
     *
     */
    fun randomize() {
        var prev: MutableList<Song> = playingSongs.subList(0, actualSongIndex)
        var next: MutableList<Song> = playingSongs.subList(actualSongIndex+1, playingSongs.lastIndex)
        next.shuffle()
        prev.addAll(next)
        playingSongs = prev
    }

    /**
     * Replace the current song list with a new one.
     *
     */
    fun replaceListPlaying(songList: List<Song>) {
        playingSongs = songList.toMutableList()
        actualSongIndex = 0
    }

    /**
     * Load a playlist to the queue
     *
     */
    fun loadPlaylist(playlist: Playlist) {
        replaceListPlaying(playlist.songs)
    }

    /**
     * Load a single song
     *
     */
    fun loadSong(song: Song) {
        var songList: List<Song> = listOf(song)
        replaceListPlaying(songList)
    }

    /**
     * Jump to a position of the queue.
     * Return true if correct position.
     */
    fun jumpToIndex(index: Int): Boolean {
        if (index >= 0 && index <= playingSongs.lastIndex) {
            actualSongIndex = index
            return true
        }
        return false
    }
}