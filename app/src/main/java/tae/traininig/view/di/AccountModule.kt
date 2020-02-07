package tae.traininig.view.di

import dagger.Module
import dagger.Provides
import tae.traininig.model.network.GitAccountService
import tae.traininig.view.AccountContract
import tae.traininig.view.AccountPresenter


@Module
class AccountModule(private val view : AccountContract.View){

    @HomeScope
    @Provides
    fun provideAccountPresenter (gitAccountService: GitAccountService):
            AccountContract.Presenter{
        return AccountPresenter(gitAccountService,view)
    }

}