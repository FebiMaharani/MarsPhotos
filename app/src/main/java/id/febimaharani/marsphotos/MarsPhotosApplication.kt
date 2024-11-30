package id.febimaharani.marsphotos

import android.app.Application
import id.febimaharani.marsphotos.data.AppContainer
import id.febimaharani.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
