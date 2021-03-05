package com.example.coffeeloka.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.coffeeloka.R
import com.example.coffeeloka.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage()
        backButton()
        onClick()

    }

    private fun onClick() {
        binding.tbProfile.setNavigationOnClickListener {
            finish()
        }
    }


    private fun backButton() {
        binding.tbProfile.setNavigationIcon(R.drawable.previous)
        setSupportActionBar(binding.tbProfile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun loadImage() {
        Glide.with(this)
            .load(R.drawable.profile)
            .apply(RequestOptions.overrideOf(200,200))
            .into(binding.imageView6)
    }
}