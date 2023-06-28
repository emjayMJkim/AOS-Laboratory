package com.puzzling.aoslaboratory.data.source.remote

import com.puzzling.aoslaboratory.data.model.request.ExampleRequest
import com.puzzling.aoslaboratory.data.model.response.ExampleResponse
import com.puzzling.aoslaboratory.data.service.ExampleService

class ExampleRemoteDataSource(
    private val exampleService: ExampleService
) {
    suspend fun postExample(exampleRequestDto: ExampleRequest): ExampleResponse =
        exampleService.postExample(exampleRequestDto)
}
