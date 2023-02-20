package jth.com.braincommerce.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import jth.com.braincommerce.data.repository.JobsRepositoryImpl
import jth.com.braincommerce.domain.usecase.GetCellsUseCase
import jth.com.braincommerce.domain.usecase.GetRecruitsUseCase

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun providesGetRecruitsUseCase(repository: JobsRepositoryImpl): GetRecruitsUseCase {
        return GetRecruitsUseCase(repository)
    }

    @Provides
    fun providesGetCellsUseCase(repository: JobsRepositoryImpl): GetCellsUseCase {
        return GetCellsUseCase(repository)
    }
}