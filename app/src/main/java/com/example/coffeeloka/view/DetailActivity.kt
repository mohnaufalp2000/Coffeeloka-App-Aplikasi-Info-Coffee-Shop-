package com.example.coffeeloka.view

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.bumptech.glide.Glide
import com.example.coffeeloka.R
import com.example.coffeeloka.databinding.ActivityDetailBinding
import com.google.android.material.snackbar.Snackbar
import com.like.LikeButton
import com.like.OnLikeListener


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

        val detailTitleCoffee = intent.getStringExtra(TITLE)
        val detailAddressCoffee = intent.getStringExtra(ADDRESS)
        val detailDetailCoffee = intent.getStringExtra(DETAIL)
        val detailHoursCoffee = intent.getStringExtra(HOURS)
        val detailPriceCoffee = intent.getStringExtra(PRICE)
        val detailRateCoffe = intent.getDoubleExtra(RATE, 0.0)
        val number = intent.getStringExtra(CALL)
        val detailImageCoffee = intent.getIntExtra(IMAGE, 0)

        getData(detailTitleCoffee, detailAddressCoffee, detailDetailCoffee, detailHoursCoffee, detailPriceCoffee, detailRateCoffe, detailImageCoffee)
        callCoffeeShop(number)
        shareContent(detailTitleCoffee, detailAddressCoffee, detailHoursCoffee, detailPriceCoffee, number)
        addToFavorites()
        backButton()
        onClick()

    }

    private fun addToFavorites() {
        binding.likeButton.setOnLikeListener(object : OnLikeListener {
            override fun liked(likeButton: LikeButton?) {
                val mySnackbar = Snackbar.make(
                    binding.detailActivity,
                    "Berhasil Menambahkan Coffee Shop Favorit",
                    Snackbar.LENGTH_LONG)
                mySnackbar.view.setBackgroundColor(Color.rgb(92, 184, 92))
                mySnackbar.show()
            }

            override fun unLiked(likeButton: LikeButton?) {
                val mySnackbar = Snackbar.make(
                    binding.detailActivity,
                    "Berhasil Menghapus Coffee Shop Favorit",
                    Snackbar.LENGTH_LONG)
                mySnackbar.view.setBackgroundColor(Color.rgb(92, 184, 92))
                mySnackbar.show()
            }

        })
    }

    private fun shareContent(detailTitleCoffee : String?, detailAddressCoffee: String?,
                             detailHoursCoffee: String?, detailPriceCoffee : String?, number: String?) {

        binding.btnShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.setType("text/plain")

            val content = "$detailTitleCoffee\n\n" +
                    "Alamat : $detailAddressCoffee\n" +
                    "Harga : " +
                    "$detailPriceCoffee\n" +
                    "No. Telpon : $number"

            shareIntent.apply {
                putExtra(Intent.EXTRA_SUBJECT, "Subject Here")
                putExtra(Intent.EXTRA_TEXT, content)
            }
            startActivity(Intent.createChooser(shareIntent, "Pilih Aplikasi :"))
        }
    }


    private fun callCoffeeShop(number : String?) {

        binding.btnCall.setOnClickListener {
            val intentImplicit = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(intentImplicit)
        }

    }


    private fun getData(
        detailTitleCoffee : String?, detailAddressCoffee: String?, detailDetailCoffee: String?,
        detailHoursCoffee: String?, detailPriceCoffee : String?, detailRateCoffe : Double?, detailImageCoffee : Int?) {


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

    private fun onClick() {
        binding.tbDetail.setNavigationOnClickListener {
            finish()
        }
    }
    
    private fun backButton() {
        binding.appBarDetail.bringToFront()
        binding.tbDetail.setNavigationIcon(R.drawable.previous)
        setSupportActionBar(binding.tbDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }





}