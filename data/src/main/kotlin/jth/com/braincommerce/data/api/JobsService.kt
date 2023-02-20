package jth.com.braincommerce.data.api

import jth.com.braincommerce.data.model.CellItemsDTO
import jth.com.braincommerce.data.model.RecruitItemsDTO
import retrofit2.http.GET

interface JobsService {
    @GET("test_data_recruit_items.json")
    suspend fun getRecruits() : RecruitItemsDTO

    @GET("test_data_cell_items.json")
    suspend fun getCells() : CellItemsDTO
}