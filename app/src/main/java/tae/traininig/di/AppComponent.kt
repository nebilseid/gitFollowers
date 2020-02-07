package tae.traininig.di

import dagger.Component
import tae.traininig.di.NetworkModule
import tae.traininig.model.network.GitAccountService
import javax.inject.Singleton


@Component(modules = [NetworkModule::class])

@Singleton
interface AppComponent {
    fun getAccount(): GitAccountService

}


