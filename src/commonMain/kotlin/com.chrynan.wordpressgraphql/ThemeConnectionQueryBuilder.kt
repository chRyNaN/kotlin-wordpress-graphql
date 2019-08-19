package com.chrynan.wordpressgraphql

class ThemeConnectionQueryBuilder : ConnectionQueryBuilder<ThemeQueryBuilder, ThemeEdgeQueryBuilder>() {

    override fun edges(builder: ThemeEdgeQueryBuilder.() -> Unit) =
        gqlObject(
            name = "edges",
            objectBuilder = ThemeEdgeQueryBuilder(),
            objectFieldBuilder = builder
        )

    override fun nodes(builder: ThemeQueryBuilder.() -> Unit) =
        gqlObject(
            name = "nodes",
            objectBuilder = ThemeQueryBuilder(),
            objectFieldBuilder = builder
        )
}