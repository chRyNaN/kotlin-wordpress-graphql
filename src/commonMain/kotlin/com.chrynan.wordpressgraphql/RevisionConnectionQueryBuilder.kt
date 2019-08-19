package com.chrynan.wordpressgraphql

class RevisionConnectionQueryBuilder :
    ConnectionQueryBuilder<RevisionQueryBuilder, RevisionEdgeQueryBuilder>() {

    override fun edges(builder: RevisionEdgeQueryBuilder.() -> Unit) =
        gqlObject(name = "edges", objectBuilder = RevisionEdgeQueryBuilder(), objectFieldBuilder = builder)

    override fun nodes(builder: RevisionQueryBuilder.() -> Unit) =
        gqlObject(name = "nodes", objectBuilder = RevisionQueryBuilder(), objectFieldBuilder = builder)
}