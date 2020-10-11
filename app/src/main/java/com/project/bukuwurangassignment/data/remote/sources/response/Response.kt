package com.project.bukuwurangassignment.data.remote.sources.response

import com.google.gson.annotations.SerializedName
data class Response(
    @SerializedName("data")
    val `data`: List<Data?>? = listOf(),
    @SerializedName("page")
    val page: Int? = 0,
    @SerializedName("per_page")
    val perPage: Int? = 0,
    @SerializedName("total")
    val total: Int? = 0,
    @SerializedName("total_pages")
    val totalPages: Int? = 0
) {

    data class Data(
        @SerializedName("color")
        val color: String? = "",
        @SerializedName("id")
        val id: Int? = 0,
        @SerializedName("name")
        val name: String? = "",
        @SerializedName("pantone_value")
        val pantoneValue: String? = "",
        @SerializedName("year")
        val year: Int? = 0
    )
}