package com.puzzling.aoslaboratory.data.repository

import com.puzzling.aoslaboratory.data.model.request.ExampleRequest
import com.puzzling.aoslaboratory.data.model.response.ExampleResponse
import com.puzzling.aoslaboratory.data.source.remote.ExampleRemoteDataSource
import com.puzzling.aoslaboratory.domain.repository.ExampleRepository

class ExampleRepositoryImpl(
    private val exampleDataSource: ExampleRemoteDataSource
) : ExampleRepository {
    override suspend fun postExample(exampleRequest: ExampleRequest): Result<ExampleResponse> =
        kotlin.runCatching { exampleDataSource.postExample(exampleRequest) }
}
