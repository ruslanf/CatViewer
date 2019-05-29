package studio.bz_soft.catviewer.di

import kotlinx.coroutines.channels.Channel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import studio.bz_soft.catviewer.data.Repository
import studio.bz_soft.catviewer.data.http.ApiClient
import studio.bz_soft.catviewer.data.http.ApiClientInterface
import studio.bz_soft.catviewer.root.App
import studio.bz_soft.catviewer.root.Constants
import studio.bz_soft.catviewer.root.MainRouter

val appModule = module {
    single { androidApplication() as App }
    single { ApiClient(Constants.API_MAIN_URL, androidContext()) as ApiClientInterface }
    single { Repository(get()) }
}

val navigatorModule = module {
    single { Cicerone.create() }
    single { get<Cicerone<Router>>().router as Router }
    single { get<Cicerone<Router>>().navigatorHolder as NavigatorHolder }
    single { MainRouter(get(), Channel(Channel.UNLIMITED)).apply { start() } }
}