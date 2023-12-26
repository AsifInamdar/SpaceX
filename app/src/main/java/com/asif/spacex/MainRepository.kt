package com.asif.spacex

import com.apollographql.apollo3.ApolloClient

class MainRepository(private val apolloClient: ApolloClient) {

    suspend fun getContinents() =
        apolloClient.query(GetContinentsQuery()).execute()
}