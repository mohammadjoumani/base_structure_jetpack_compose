package com.mmj.basestructure.data.network

import com.mmj.basestructure.R
import com.mmj.basestructure.core.generic.UiText

fun handleError(message: String): UiText {
    return when (message) {
        ConstantsErrorHandler.EXCEPTION_MESSAGE -> {
            UiText.StringResource(resId = R.string.app_name)
        }
        ConstantsErrorHandler.NO_CONNECTION_INTERNET_MESSAGE -> {
            UiText.StringResource(resId = R.string.app_name)
        }
        else -> {
            UiText.StringResource(resId = R.string.app_name)
        }
    }
}

object ConstantsErrorHandler {
    // Message Exception
    const val EXCEPTION_MESSAGE = "ExceptionMessage"
    const val NO_CONNECTION_INTERNET_MESSAGE = "NoConnectionInternetMessage"

    //endregion
}