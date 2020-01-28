package tae.traininig.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import tae.traininig.common.BaseViewModel
import tae.traininig.common.addTo
import tae.traininig.model.data.GitAccounts


class GitAccountViewModel(private val getGitAccoutUseCase: GetAccoutUseCase) : BaseViewModel() {

    private val contentLiveData = MutableLiveData<List<GitAccounts>>()
    private val loadingLiveData = MutableLiveData<Boolean>()


    private fun getWishListApi() {
        getGitAccoutUseCase.execute()
            .doOnSubscribe { loadingLiveData.value = true }
            .doOnEvent { _, _ -> loadingLiveData.value = false }
            .subscribe({
                contentLiveData.value = it.accounts
            }, {
            }).addTo(compositeDisposable)
    }

    fun getContentObservable(): LiveData<List<GitAccounts>> = contentLiveData
}