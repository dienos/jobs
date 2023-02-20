package jth.com.braincommerce.domain.model

data class Company(
    val name: String?,
    val logoPath: String?,
    val ratings: List<Rating>
)