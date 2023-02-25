package com.example.passingdata

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.passingdata.databinding.ActivityMainBinding

class NextScreen : AppCompatActivity() {
    lateinit var tvName: TextView
    lateinit var tvClass: TextView
    lateinit var tvAbout: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_screen)

        tvName= findViewById(R.id.tvName)
        tvClass=findViewById(R.id.tvClass)
        tvAbout=findViewById(R.id.tvAbout)

        intent?.let {
            var name = intent.getStringExtra("UrName")
            tvName.text= name

            var Class = intent.getStringExtra("UrClass")
            tvClass.text = Class

            var About = intent.getStringExtra("UrAbout")
            tvAbout.text = About

        }
    }
}