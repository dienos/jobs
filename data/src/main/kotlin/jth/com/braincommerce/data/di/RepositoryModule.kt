package jth.com.braincommerce.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jth.com.braincommerce.data.repository.SampleRepository
import jth.com.braincommerce.data.repository.SampleRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindsSampleRepository(
        localSource: SampleRepositoryImpl
    ): SampleRepository
}