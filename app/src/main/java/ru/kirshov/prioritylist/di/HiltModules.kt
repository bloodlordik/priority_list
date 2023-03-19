package ru.kirshov.prioritylist.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object Variables{
    @Provides
    fun getText():String = "VewModel text"
}