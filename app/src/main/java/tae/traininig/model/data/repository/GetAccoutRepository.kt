package tae.traininig.model.data.repository

import io.reactivex.Single
import tae.traininig.model.data.DataGitRepositories

interface GitAccountRepository {
    fun getGitAccount(): Single<DataGitRepositories>
}