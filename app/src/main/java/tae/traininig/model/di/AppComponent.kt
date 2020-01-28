package tae.traininig.model.di

import dagger.Component
import tae.traininig.model.network.GitAccount
import javax.inject.Singleton


@Component(modules = [NetworkModule::class])

@Singleton
interface AppComponent {
    fun getAccount(): GitAccount

}