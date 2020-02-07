package tae.traininig.view

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.git_account_item.view.*
import okhttp3.Response
import tae.traininig.R
import tae.traininig.model.data.GitAccounts


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class GitAccountAdapter : RecyclerView.Adapter<GitAccountAdapter.AccountViewHolder>() {

    private val data = arrayListOf<GitAccounts>()


    fun setData (items: List<GitAccounts>){
        data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.git_account_item, parent,false)
        return AccountViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder:AccountViewHolder, position: Int) {
        viewHolder.bind(data[position])

    }



    class AccountViewHolder (val view: View): RecyclerView.ViewHolder(view){
        fun bind (response: GitAccounts){
            view.tv_name.text = response.id.toString()
            view.tv_repo.text = response.repos_url

        //    Picasso.get().load(response.thumbnail).into(view.ivRecipe)

        }
    }}