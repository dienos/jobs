package jth.com.braincommerce.domain.usecase

import jth.com.braincommerce.data.repository.JobsRepository
import jth.com.braincommerce.domain.model.Recruit

class GetRecruitsUseCase(private val repository: JobsRepository) {
    suspend operator fun invoke(
    ): List<Recruit> {
        val result: MutableList<Recruit> = mutableListOf()
        val response = repository.getRecruits()
        return result
    }
}