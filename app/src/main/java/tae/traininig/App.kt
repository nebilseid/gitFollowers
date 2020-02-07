package tae.traininig

import android.app.Application
import tae.traininig.di.AppComponent
import tae.traininig.di.DaggerAppComponent


class App: Application(){
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .build()

    }
    fun getComponent()=appComponent
}