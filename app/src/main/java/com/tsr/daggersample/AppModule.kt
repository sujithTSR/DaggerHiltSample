package com.tsr.daggersample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Declare strings here and try to inject in Actiivty/Fragment/ViewModels
    // Similar to string, we can have retrofit instances etc

    // Singleton to make sure the object is created only once. Most use cases - Retrofit, Room
    // Provides - Hey, hilt - this is a dependency which is to be noted
    @Singleton
    @Provides
    @Named("String1")
    fun provideTestString() = "Example String1"

    @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2() = "Example String2"

}