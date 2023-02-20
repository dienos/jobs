package jth.com.braincommerce.domain.usecase

import jth.com.braincommerce.data.repository.JobsRepository
import jth.com.braincommerce.domain.model.Recruit

class GetCellsUseCase(private val repository: JobsRepository) {
    suspend operator fun invoke(
    ): List<Recruit> {
        val result: MutableList<Recruit> = mutableListOf()
        val response = repository.getCells()
        return result
    }
}