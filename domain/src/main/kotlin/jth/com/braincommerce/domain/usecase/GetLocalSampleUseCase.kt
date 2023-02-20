package jth.com.braincommerce.domain.usecase

import jth.com.braincommerce.data.repository.SampleRepository
import jth.com.braincommerce.domain.model.LocalSample

class GetLocalSampleUseCase(private val repository: SampleRepository) {
    suspend operator fun invoke(
    ): List<LocalSample> {
        val result: MutableList<LocalSample> = mutableListOf()
        val response = repository.getLocalSample()

        response.forEach {
            result.add(LocalSample(it.id, it.name))
        }

        return result
    }
}