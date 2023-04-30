package com.mmj.basestructure.core.generic.usecase

interface BaseUseCase<In, Out>{
    suspend fun execute(input: In): Out
}