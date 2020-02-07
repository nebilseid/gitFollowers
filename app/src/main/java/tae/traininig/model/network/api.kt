package tae.traininig.model.network

import io.reactivex.Observable
import retrofit2.http.GET
import tae.traininig.model.data.DataGitAccountResponse

interface GitAccountService {
    @GET("https://api.github.com/users/octocat/followers/")
    fun getAccount(): Observable<DataGitAccountResponse>


}
