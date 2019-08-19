package com.chrynan.wordpressgraphql

fun query(builder: RootQueryBuilder.() -> Unit) =
    com.chrynan.graphqlquerybuilder.query(builder = RootQueryBuilder(), query = builder)