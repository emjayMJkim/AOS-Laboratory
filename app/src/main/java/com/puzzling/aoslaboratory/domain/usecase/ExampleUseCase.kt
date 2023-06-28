package com.puzzling.aoslaboratory.domain.usecase

import com.puzzling.aoslaboratory.domain.repository.ExampleRepository

class ExampleUseCase(
    private val exampleRepository: ExampleRepository
) {
    // 비즈니스 로직 처리
}
