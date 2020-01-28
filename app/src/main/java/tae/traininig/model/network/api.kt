package tae.traininig.model.network

import io.reactivex.Observable
import retrofit2.http.GET
import tae.traininig.model.data.DataGitRepositories

interface GitAccount {
    @GET("https://api.github.com/users/octocat/followers/")
    fun getAccount(): Observable<DataGitRepositories>


}
