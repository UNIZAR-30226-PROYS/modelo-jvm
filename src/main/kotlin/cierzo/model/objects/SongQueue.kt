package cierzo.model.objects

object SongQueue {
    var playingSongs: MutableList<Song> = mutableListOf()
    var originalPlaylist: MutableList<Song> = mutableListOf()
    var actualSongIndex: Int = 0
    var repeat: Boolean = false
    var random: Boolean = false

    /**
     * Return the last song played on this list.
     * If there aren't previous song, return the same.
     *
     */
    fun getPreviousSong(): Song {
        if (actualSongIndex == 0) {
            if (repeat) {
                actualSongIndex = playingSongs.lastIndex
            }
        } else {
            actualSongIndex -= 1
        }
        return playingSongs[actualSongIndex]
    }

    /**
     * Return the next song to be played on this list.
     * If there aren't next song and repeat isn't active, return null.
     */
    fun getNextSong(): Song? {
        if (actualSongIndex == playingSongs.lastIndex) {
            if (repeat) {
                actualSongIndex = 0
            } else {
                return null
            }
        } else {
            actualSongIndex += 1
        }
        return playingSongs[actualSongIndex]
    }

    /**
     * Randomize the next songs.
     *
     */
    fun toggleRandom() {
        if (!random) {
            var prev: MutableList<Song> = playingSongs.subList(0, actualSongIndex + 1)
            var next: MutableList<Song> = playingSongs.subList(actualSongIndex + 1, playingSongs.lastIndex + 1)
            next.shuffle()
            prev.addAll(next)
            playingSongs = prev
        } else {
            playingSongs = originalPlaylist
        }
    }

    /**
     * Replace the current song list with a new one.
     *
     */
    fun replaceListPlaying(songList: List<Song>) {
        playingSongs = songList.toMutableList()
        actualSongIndex = 0
        originalPlaylist = playingSongs
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