package com.example.coffeeloka.view

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import com.example.coffeeloka.R
import com.example.coffeeloka.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    companion object{
        const val TITLE = "title"
        const val ADDRESS = "address"
        const val DETAIL = "detail"
        const val HOURS = "hours"
        const val PRICE = "price"
        const val RATE = "rate"
        const val CALL = "call"
        const val IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()
        callCoffeeShop()
        backButton()

    }

    private fun callCoffeeShop() {
        val number = intent.getStringExtra(CALL)

        binding.btnCall.setOnClickListener {
            val intentImplicit = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(intentImplicit)
        }

    }


    private fun getData() {
        val detailTitleCoffee = intent.getStringExtra(TITLE)
        val detailAddressCoffee = intent.getStringExtra(ADDRESS)
        val detailDetailCoffee = intent.getStringExtra(DETAIL)
        val detailHoursCoffee = intent.getStringExtra(HOURS)
        val detailPriceCoffee = intent.getStringExtra(PRICE)
        val detailRateCoffe = intent.getDoubleExtra(RATE, 0.0)
        val detailImageCoffee = intent.getIntExtra(IMAGE, 0)

        binding.apply {
            txtTitleDetail.text = detailTitleCoffee
            txtAddressDetail.text = detailAddressCoffee
            txtDetailCoffee.text = detailDetailCoffee
            txtHoursDetail.text = detailHoursCoffee
            txtPriceDetail.text = detailPriceCoffee
            txtRateDetail.text = detailRateCoffe.toString()
        }

        Glide.with(this)
                .load(detailImageCoffee)
                .into(binding.imgDetail)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun backButton() {
        binding.appBarDetail.bringToFront()
        setSupportActionBar(binding.tbDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle(R.string.app_name)
            .setMessage("Anda yakin ingin keluar?")
            .setPositiveButton("OK",
                DialogInterface.OnClickListener {dialog, which -> finish()  }
                )
            .setNegativeButton("Cancel",
            DialogInterface.OnClickListener{dialog, which -> dialog.cancel()  })
            .show()

    }

}