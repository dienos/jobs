package jth.com.braincommerce.data.model

import com.google.gson.annotations.SerializedName

data class RecruitDTO(
    @SerializedName("id")
    val id: Int?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("reward")
    val reward: String?,

    @SerializedName("appeal")
    val appeal: String?,

    @SerializedName("image_url")
    val imageUrl: String?,

    @SerializedName("company")
    val company: CompanyDTO?
)