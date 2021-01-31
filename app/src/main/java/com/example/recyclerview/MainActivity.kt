
package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Data.USER
import com.example.recyclerview.adapter.UserAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.recycler) as RecyclerView
        recyclerView.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL,false)
       val  userAdapter = UserAdapter(USER.values())
        recyclerView.adapter=userAdapter
    }
}
