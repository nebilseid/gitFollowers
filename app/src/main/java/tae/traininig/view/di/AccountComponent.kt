package tae.traininig.view.di

import dagger.Component
import tae.traininig.di.AppComponent
import tae.traininig.view.MainActivity



@Component(dependencies = [AppComponent::class],modules =[AccountModule::class])
@HomeScope

interface AccountComponent {
    fun inject (mainActivity: MainActivity)
}