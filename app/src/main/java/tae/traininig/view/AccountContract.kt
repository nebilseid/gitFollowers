package tae.traininig.view

import tae.traininig.model.data.GitAccounts


interface AccountContract {
    interface View {
        fun showResults(results:List<GitAccounts>)
        fun showError(message: String)
    }

    interface Presenter {
        fun getAccount()
    }
}