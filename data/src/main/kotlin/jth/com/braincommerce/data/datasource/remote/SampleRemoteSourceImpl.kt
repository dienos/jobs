package jth.com.braincommerce.data.datasource.remote

import jth.com.braincommerce.data.api.SampleService
import jth.com.braincommerce.data.model.SampleDTO
import javax.inject.Inject

interface SampleRemoteSource {
    suspend fun getSimple(): List<SampleDTO>
}

class SampleRemoteSourceImpl @Inject constructor(
    private val sampleService: SampleService
) : SampleRemoteSource {
    override suspend fun getSimple(): List<SampleDTO> = sampleService.getSample()
}