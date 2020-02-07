package tae.traininig.view

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import tae.traininig.model.network.GitAccountService

class AccountPresenter(private val gitAccountService: GitAccountService,
                       private val view: AccountContract.View) : AccountContract.Presenter
 {
     private val compositeDisposable = CompositeDisposable()

    override fun getAccount() {
        compositeDisposable.add(
            gitAccountService.getAccount()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())

                .subscribe({ view.showResults(it.accounts) },
                    { failure -> view.showError(failure?.message ?: "An unknown error happened") })
        )
    }
}
