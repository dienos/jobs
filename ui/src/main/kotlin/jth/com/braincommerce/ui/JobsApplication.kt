package jth.com.braincommerce.ui

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class JobsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}