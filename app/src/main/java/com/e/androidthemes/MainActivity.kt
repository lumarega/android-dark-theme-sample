package com.e.androidthemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

/**
 * Created by Luana Marega on 2020-03-30;
 */
class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: ListView = findViewById(R.id.list)
        adapter = MainListAdapter(LayoutInflater.from(this))
        list.adapter = adapter

        list.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
                1 -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }

            }
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondSampleActivity::class.java)
            startActivity(intent)
        }
    }
}
