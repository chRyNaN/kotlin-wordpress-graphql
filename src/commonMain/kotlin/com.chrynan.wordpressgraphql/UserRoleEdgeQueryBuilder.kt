package com.chrynan.wordpressgraphql

class UserRoleEdgeQueryBuilder : EdgeQueryBuilder<UserRoleQueryBuilder>() {

    override fun node(builder: UserRoleQueryBuilder.() -> Unit) =
        gqlObject(name = "node", objectBuilder = UserRoleQueryBuilder(), objectFieldBuilder = builder)
}