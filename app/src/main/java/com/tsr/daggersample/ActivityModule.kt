package com.tsr.daggersample

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @ActivityScoped
    @Provides
    @Named("String1")
    fun provideTestString(
        @ActivityContext context: Context,
        @Named("String2") str2: String
    ) = "String 1" + str2 + context.getString(R.string.app_name)

}