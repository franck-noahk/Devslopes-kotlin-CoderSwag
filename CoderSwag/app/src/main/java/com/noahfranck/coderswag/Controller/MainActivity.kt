package com.noahfranck.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.noahfranck.coderswag.Adapter.CategoryRecyclerAdapter
import com.noahfranck.coderswag.R
import com.noahfranck.coderswag.Services.DataService
import com.noahfranck.coderswag.Utilities.EXTRA_CATAGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(DataService.categories, this){ category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATAGORY, category.title)
            startActivity(productIntent)
        }

        categoryListView.adapter = adapter
        //old implementation for previous adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        //Have to make our own onClickListener with a Lambda

    }
}
