package tae.traininig.model.data.repository

import io.reactivex.Single
import tae.traininig.model.data.DataGitAccountResponse

interface GitAccountRepository {
    fun getGitAccount(): Single<DataGitAccountResponse>
}