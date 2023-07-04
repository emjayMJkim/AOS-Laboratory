package com.puzzling.aoslaboratory.domain.repository

interface RegisterRepository {

    suspend fun register() : Result<Unit>
}
