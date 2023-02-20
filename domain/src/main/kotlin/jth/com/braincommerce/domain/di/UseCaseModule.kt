package jth.com.braincommerce.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import jth.com.braincommerce.data.repository.SampleRepositoryImpl
import jth.com.braincommerce.domain.usecase.GetLocalSampleUseCase
import jth.com.braincommerce.domain.usecase.GetSampleUseCase

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun providesGetSampleUseCase(repository: SampleRepositoryImpl): GetSampleUseCase {
        return GetSampleUseCase(repository)
    }

    @Provides
    fun providesGetLocalSampleUseCase(repository: SampleRepositoryImpl): GetLocalSampleUseCase {
        return GetLocalSampleUseCase(repository)
    }
}