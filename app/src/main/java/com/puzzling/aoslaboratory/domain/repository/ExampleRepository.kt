package com.puzzling.aoslaboratory.domain.repository

import com.puzzling.aoslaboratory.data.model.request.ExampleRequest
import com.puzzling.aoslaboratory.data.model.response.ExampleResponse

interface ExampleRepository {
    suspend fun postExample(exampleRequest: ExampleRequest): Result<ExampleResponse>
}
