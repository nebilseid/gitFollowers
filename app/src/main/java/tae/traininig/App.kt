package tae.traininig

import android.app.Application
import tae.traininig.model.di.AppComponent
import tae.traininig.model.di.DaggerAppComponent

class App: Application(){
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .build()

    }
    fun getComponent()=appComponent
}