package com.chrynan.wordpressgraphql

class ThemeEdgeQueryBuilder : EdgeQueryBuilder<ThemeQueryBuilder>() {

    override fun node(builder: ThemeQueryBuilder.() -> Unit) =
        gqlObject(
            name = "node",
            objectBuilder = ThemeQueryBuilder(),
            objectFieldBuilder = builder
        )
}