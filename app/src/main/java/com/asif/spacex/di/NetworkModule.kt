package com.asif.spacex.di

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import okhttp3.OkHttpClient
import org.koin.dsl.module
import java.util.concurrent.TimeUnit


fun provideHttpClient(): OkHttpClient {
    return OkHttpClient()
        .newBuilder()
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .build()
}

fun provideApolloClient(okHttpClient: OkHttpClient): ApolloClient {
    return ApolloClient.Builder()
        .serverUrl("https://countries.trevorblades.com")
        .okHttpClient(okHttpClient)
        .build()
}


val networkModule = module {
    single { provideHttpClient() }
    single { provideApolloClient(get()) }
}