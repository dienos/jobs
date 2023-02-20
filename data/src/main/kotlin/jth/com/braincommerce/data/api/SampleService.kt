package jth.com.braincommerce.data.api

import jth.com.braincommerce.data.model.SampleDTO
import retrofit2.http.GET

interface SampleService {
    @GET("sample")
    suspend fun getSample() : List<SampleDTO>
}