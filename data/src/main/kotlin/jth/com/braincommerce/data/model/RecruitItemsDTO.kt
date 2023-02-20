package jth.com.braincommerce.data.model

import com.google.gson.annotations.SerializedName

data class RecruitItemsDTO(
    @SerializedName("recruit_items")
    val items : List<RecruitDTO>? = null)
