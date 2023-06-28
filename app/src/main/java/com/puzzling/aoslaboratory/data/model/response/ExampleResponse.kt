package com.puzzling.aoslaboratory.data.model.response

import kotlinx.serialization.Serializable

@Serializable
data class ExampleResponse(
    val id: Int,
    val title: String,
    val content: String
)
