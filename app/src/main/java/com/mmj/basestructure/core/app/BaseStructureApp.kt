package com.mmj.basestructure.core.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseStructureApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}