package tae.traininig.di

import dagger.Component
import tae.traininig.model.network.GitAccountService
import javax.inject.Singleton


@Component(modules = [NetworkModule::class])

@Singleton
interface AppComponent {
    fun gitAccountService(): GitAccountService

}


