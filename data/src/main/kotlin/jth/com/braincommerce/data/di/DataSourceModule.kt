package jth.com.braincommerce.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jth.com.braincommerce.data.datasource.remote.JobsRemoteSource
import jth.com.braincommerce.data.datasource.remote.JobsRemoteSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract fun bindsJobsRemoteSource(source: JobsRemoteSourceImpl): JobsRemoteSource
}