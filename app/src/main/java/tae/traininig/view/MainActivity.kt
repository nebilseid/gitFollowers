package tae.traininig.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.Provides
import kotlinx.android.synthetic.main.activity_main.*
import tae.traininig.App
import tae.traininig.R
import tae.traininig.model.data.GitAccounts
import tae.traininig.view.di.AccountModule
import javax.inject.Inject

class MainActivity(private val accountAdapter: GitAccountAdapter) : AppCompatActivity(), AccountContract.View {


    @Inject
    lateinit var accountPresenter: AccountPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAccountComponent.builder()
            .appComponent((application as App).getComponent())
            .accountModule(AccountModule(this))
            .build()
            .inject(this)




        /*   DaggerAppComponent.builder()
               .appComponent((application as App).getComponent())
               .recipeModule(AccoutModule(this))
               .build()

           DaggerRecipeComponent.builder()
               .appComponent((application as App).getComponent())
               .recipeModule(RecipeModule(this))
               .build()
               .inject(this)



               .inject(this)*/


        rv_git_account.layoutManager = LinearLayoutManager(this)
        rv_git_account.adapter = accountAdapter

        accountPresenter.getAccount()
    }


    override fun showResults(results: List<GitAccounts>) {
        accountAdapter.setData(results)
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    }


}
