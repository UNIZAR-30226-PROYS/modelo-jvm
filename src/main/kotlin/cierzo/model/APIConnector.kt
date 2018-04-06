package cierzo.model

import io.swagger.client.apis.AdminsApi
import io.swagger.client.apis.PublicApi
import io.swagger.client.apis.UsersApi

object APIConnector {
    internal val publicApi: PublicApi = PublicApi()
    internal val adminsApi: AdminsApi = AdminsApi()
    internal val usersApi: UsersApi = UsersApi()
}