package jth.com.braincommerce.data.repository

import jth.com.braincommerce.data.datasource.local.SampleLocalSource
import jth.com.braincommerce.data.datasource.remote.SampleRemoteSource
import jth.com.braincommerce.data.model.SampleEntity
import jth.com.braincommerce.data.model.SampleDTO
import javax.inject.Inject

interface SampleRepository {
    suspend fun getLocalSample(): List<SampleEntity>
    suspend fun getSample(): List<SampleDTO>
}

class SampleRepositoryImpl @Inject constructor(
    private val localSource: SampleLocalSource,
    private val remoteSource: SampleRemoteSource
) : SampleRepository {
    override suspend fun getLocalSample(): List<SampleEntity> = localSource.getLocalSimple()
    override suspend fun getSample(): List<SampleDTO> = remoteSource.getSimple()
}