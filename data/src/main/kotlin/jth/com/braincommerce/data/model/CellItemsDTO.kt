package jth.com.braincommerce.data.model

import com.google.gson.annotations.SerializedName

data class CellItemsDTO(
    @SerializedName("cell_items")
    val items : List<CellDTO>? = null)
