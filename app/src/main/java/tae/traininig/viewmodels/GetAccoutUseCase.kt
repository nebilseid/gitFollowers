package tae.traininig.viewmodels

import io.reactivex.Single
import tae.traininig.common.ThreadScheduler
import tae.traininig.model.data.DataGitRepositories
import tae.traininig.model.data.repository.GitAccountRepository

class GetAccoutUseCase(threadScheduler: ThreadScheduler, private val gitAccoutRepository: GitAccountRepository) : SingleNoParamsUseCase<DataGitRepositories>(threadScheduler) {
    override fun create(): Single<DataGitRepositories> = gitAccoutRepository.getGitAccount()
}