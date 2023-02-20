package jth.com.braincommerce.data.model

import com.google.gson.annotations.SerializedName

data class CompanyDTO(
    @SerializedName("name")
    val name: String?,

    @SerializedName("logo_path")
    val logoPath: String?,

    @SerializedName("ratings")
    val ratings: List<RatingDTO>
)