package tae.traininig.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import tae.traininig.model.data.GitAccounts
import javax.inject.Inject


class MainActivity : AppCompatActivity(), AccountContract.View{


    @Inject
    lateinit var accountPresenter: AccountPresenter
    private val accountAdapter = GitAccountAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(tae.traininig.R.layout.activity_main)





/*
       DaggerAppComponent.builder()
            .appComponent((application as App).getComponent())
            .accountModule(AccountModule(this))
            .build()
            .inject(this)

            */



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
