package cierzo.model

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