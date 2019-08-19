package com.chrynan.wordpressgraphql

import com.chrynan.graphqlquerybuilder.GraphQLQueryBuilder

class ThemeQueryBuilder : GraphQLQueryBuilder() {

    val id by gqlScalar(name = "id")

    val author by gqlScalar(name = "author")

    val authorUri by gqlScalar(name = "authorUri")

    val name by gqlScalar(name = "name")

    val description by gqlScalar(name = "description")

    val isRestricted by gqlScalar(name = "isRestricted")

    val screenshot by gqlScalar(name = "screenshot")

    val slug by gqlScalar(name = "slug")

    val tags by gqlScalar(name = "tags")

    val themeUri by gqlScalar(name = "themeUri")

    val version by gqlScalar(name = "version")
}