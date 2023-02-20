package jth.com.braincommerce.data.repository

import jth.com.braincommerce.data.datasource.remote.JobsRemoteSource
import jth.com.braincommerce.data.model.CellItemsDTO
import jth.com.braincommerce.data.model.RecruitItemsDTO
import javax.inject.Inject

interface JobsRepository {
    suspend fun getRecruits(): RecruitItemsDTO
    suspend fun getCells(): CellItemsDTO
}

class JobsRepositoryImpl @Inject constructor(
    private val remoteSource: JobsRemoteSource
) : JobsRepository {
    override suspend fun getRecruits(): RecruitItemsDTO = remoteSource.getRecruits()
    override suspend fun getCells(): CellItemsDTO = remoteSource.getCells()
}