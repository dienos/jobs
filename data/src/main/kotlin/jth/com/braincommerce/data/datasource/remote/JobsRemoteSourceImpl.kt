package jth.com.braincommerce.data.datasource.remote

import jth.com.braincommerce.data.api.JobsService
import jth.com.braincommerce.data.model.CellItemsDTO
import jth.com.braincommerce.data.model.RecruitItemsDTO
import javax.inject.Inject

interface JobsRemoteSource {
    suspend fun getRecruits(): RecruitItemsDTO
    suspend fun getCells(): CellItemsDTO
}

class JobsRemoteSourceImpl @Inject constructor(
    private val service: JobsService
) : JobsRemoteSource {
    override suspend fun getRecruits(): RecruitItemsDTO = service.getRecruits()
    override suspend fun getCells(): CellItemsDTO = service.getCells()
}