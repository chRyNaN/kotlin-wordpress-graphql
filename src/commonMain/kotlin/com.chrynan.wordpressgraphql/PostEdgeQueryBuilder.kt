package com.chrynan.wordpressgraphql

class PostEdgeQueryBuilder : EdgeQueryBuilder<PostQueryBuilder>() {

    override fun node(builder: PostQueryBuilder.() -> Unit) =
        gqlObject(name = "node", objectBuilder = PostQueryBuilder(), objectFieldBuilder = builder)
}