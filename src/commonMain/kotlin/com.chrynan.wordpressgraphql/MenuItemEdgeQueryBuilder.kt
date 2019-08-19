package com.chrynan.wordpressgraphql

class MenuItemEdgeQueryBuilder : EdgeQueryBuilder<MenuItemQueryBuilder>() {

    override fun node(builder: MenuItemQueryBuilder.() -> Unit) =
        gqlObject(name = "node", objectBuilder = MenuItemQueryBuilder(), objectFieldBuilder = builder)
}