package cierzo.model.objects

import cierzo.model.APIConnector
import io.swagger.annotations.Api
import io.swagger.client.ApiException
import io.swagger.client.model.AccountItem
import io.swagger.client.model.LoginItem

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
}