package com.chrynan.wordpressgraphql

class CategoryEdgeQueryBuilder : EdgeQueryBuilder<CategoryQueryBuilder>() {

    override fun node(builder: CategoryQueryBuilder.() -> Unit) =
        gqlObject(name = "node", objectBuilder = CategoryQueryBuilder(), objectFieldBuilder = builder)
}