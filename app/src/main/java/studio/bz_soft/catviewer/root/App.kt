package studio.bz_soft.catviewer.root

import android.app.Application
import org.koin.android.ext.android.startKoin
import studio.bz_soft.catviewer.di.appModule
import studio.bz_soft.catviewer.di.navigatorModule

class App : Application() {

    private lateinit var instance: App

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin(this, listOf(appModule, navigatorModule))
    }
}