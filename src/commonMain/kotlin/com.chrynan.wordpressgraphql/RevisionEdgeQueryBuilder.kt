package com.chrynan.wordpressgraphql

class RevisionEdgeQueryBuilder : EdgeQueryBuilder<RevisionQueryBuilder>() {

    override fun node(builder: RevisionQueryBuilder.() -> Unit) =
        gqlObject(name = "node", objectBuilder = RevisionQueryBuilder(), objectFieldBuilder = builder)
}