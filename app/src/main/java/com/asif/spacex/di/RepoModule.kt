package com.asif.spacex.di

import com.apollographql.apollo3.ApolloClient
import com.asif.spacex.MainRepository
import org.koin.dsl.module


val repoModules = module {
    factory { MainRepository(get()) }
}