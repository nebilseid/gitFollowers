package tae.traininig.viewmodels

import io.reactivex.Single
import tae.traininig.common.ThreadScheduler
import tae.traininig.model.data.DataGitAccountResponse
import tae.traininig.model.data.repository.GitAccountRepository

class GetAccoutUseCase(threadScheduler: ThreadScheduler, private val gitAccoutRepository: GitAccountRepository) : SingleNoParamsUseCase<DataGitAccountResponse>(threadScheduler) {
    override fun create(): Single<DataGitAccountResponse> = gitAccoutRepository.getGitAccount()
}