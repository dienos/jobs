package jth.com.braincommerce.data.model

import com.google.gson.annotations.SerializedName

data class RatingDTO(
    @SerializedName("type")
    val type: String,

    @SerializedName("rating")
    val rating: Float,
)