package com.mmj.basestructure.domain.usecase

import com.mmj.basestructure.core.generic.usecase.BaseUseCase
import javax.inject.Inject

class LoginUseCase @Inject constructor() : BaseUseCase<String, String> {
    override suspend fun execute(input: String): String {
        return ""
    }
}