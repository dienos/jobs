package jth.com.braincommerce.data.model

import com.google.gson.annotations.SerializedName

data class CellDTO(
    @SerializedName("cell_type")
    val cellType: String?,

    @SerializedName("count")
    val count: Int?,

    @SerializedName("section_title")
    val sectionTitle: String?,

    @SerializedName("recommend_recruit")
    val recommendRecruit: RecruitDTO?,

    @SerializedName("logo_path")
    val logoPath: String?,

    @SerializedName("name")
    val name: String?,

    @SerializedName("industry_name")
    val industryName: String?,

    @SerializedName("rate_total_avg")
    val rateTotalAvg: String?,

    @SerializedName("review_summary")
    val reviewSummary: String?,

    @SerializedName("count")
    val cons: String?,

    @SerializedName("pros")
    val pros: String?,

    @SerializedName("interview_question")
    val interviewQuestion: String?,

    @SerializedName("salary_avg")
    val salaryAvg: String?,

    @SerializedName("update_date")
    val updateDate: String?,
)