package com.example.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChange.setOnClickListener {
            if (binding.etName.text.isEmpty()){
                binding.etName.error="Enter your name"
                binding.etName.requestFocus()
            }
            else if (binding.etClass.text.isEmpty()){
                binding.etClass.error="Enter your class"
                binding.etName.requestFocus()
            }
            else if (binding.etAbout.text.isEmpty()){
                binding.etAbout.error="About you"
                binding.etName.requestFocus()
            }
            else{
                val intent=Intent(this,NextScreen::class.java)
                intent.putExtra("UrName", binding.etName.text.toString())
                intent.putExtra("UrClass", binding.etClass.text.toString())
                intent.putExtra("UrAbout", binding.etAbout.text.toString())

                startActivity(intent)
            }
        }
    }
}