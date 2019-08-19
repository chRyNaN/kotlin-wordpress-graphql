package com.chrynan.wordpressgraphql

import com.chrynan.graphqlquerybuilder.GraphQLQueryBuilder

class UserRoleQueryBuilder : GraphQLQueryBuilder() {

    val capabilities by gqlScalar(name = "capabilities")

    val id by gqlScalar(name = "id")

    val isRestricted by gqlScalar(name = "isRestricted")

    val name by gqlScalar(name = "name")
}