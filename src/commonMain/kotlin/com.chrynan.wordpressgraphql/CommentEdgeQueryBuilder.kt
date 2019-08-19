package com.chrynan.wordpressgraphql

class CommentEdgeQueryBuilder : EdgeQueryBuilder<CommentQueryBuilder>() {

    override fun node(builder: CommentQueryBuilder.() -> Unit) =
        gqlObject(name = "node", objectBuilder = CommentQueryBuilder(), objectFieldBuilder = builder)
}