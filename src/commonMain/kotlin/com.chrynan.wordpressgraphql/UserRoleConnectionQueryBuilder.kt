package com.chrynan.wordpressgraphql

class UserRoleConnectionQueryBuilder : ConnectionQueryBuilder<UserRoleQueryBuilder, UserRoleEdgeQueryBuilder>() {

    override fun edges(builder: UserRoleEdgeQueryBuilder.() -> Unit) =
        gqlObject(name = "nodes", objectBuilder = UserRoleEdgeQueryBuilder(), objectFieldBuilder = builder)

    override fun nodes(builder: UserRoleQueryBuilder.() -> Unit) =
        gqlObject(name = "nodes", objectBuilder = UserRoleQueryBuilder(), objectFieldBuilder = builder)
}