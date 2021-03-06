package com.noahfranck.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.noahfranck.coderswag.Adapter.CategoryAdapter
import com.noahfranck.coderswag.Model.Category
import com.noahfranck.coderswag.R
import com.noahfranck.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
            DataService.categories
        )

        categoryListView.adapter = adapter

    }
}
