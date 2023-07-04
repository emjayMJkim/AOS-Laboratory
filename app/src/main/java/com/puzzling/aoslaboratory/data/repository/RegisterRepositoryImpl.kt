package com.puzzling.aoslaboratory.data.repository

import com.puzzling.aoslaboratory.data.source.remote.RegisterRemoteDataSource
import com.puzzling.aoslaboratory.domain.repository.RegisterRepository

class RegisterRepositoryImpl(private val registerRemoteDataSource: RegisterRemoteDataSource) : RegisterRepository {

    override suspend fun register(): Result<Unit> =
        kotlin.runCatching {
        }
}
