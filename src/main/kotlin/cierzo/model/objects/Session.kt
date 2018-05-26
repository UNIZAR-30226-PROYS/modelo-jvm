package cierzo.model.objects

import cierzo.model.APIConnector

/**
 * This object saves the current session playing
 */
class Session private constructor() {
    var playlistId: String? = null
    var second: String? = null
    var songId: String? = null

    companion object {
        private val instance = Session()

        fun getInstance(): Session {
            return instance
        }
    }


    /**
     * Returns if is any session stored here.
     * Can be used in the application.
     */
    public fun isSessionStored(): Boolean {
        return if (playlistId == null || second == null || songId == null) {
            false
        } else {
            true
        }
    }

    /**
     * Restore session from server.
     * User must be logged.
     */
    internal fun restoreSession() {
        var session: Set<String> = APIConnector.getInstance().getSession()
        playlistId = session.elementAt(0)
        second = session.elementAt(1)
        songId = session.elementAt(2)
    }

    /**
     * Saves the current session on server.
     * User must be logged.
     */
    internal fun saveSession() {
        if (isSessionStored()) {
            APIConnector.getInstance().saveSession(playlistId!!, second!!, songId!!)
        } else {
            throw Exception("No session stored")
        }
    }
}