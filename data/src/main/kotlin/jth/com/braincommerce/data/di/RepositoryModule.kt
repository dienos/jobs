package jth.com.braincommerce.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jth.com.braincommerce.data.repository.JobsRepository
import jth.com.braincommerce.data.repository.JobsRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindsJobsRepository(
        localSource: JobsRepositoryImpl
    ): JobsRepository
}