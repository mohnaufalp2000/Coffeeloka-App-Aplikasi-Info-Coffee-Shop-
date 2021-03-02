package com.example.coffeeloka.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coffeeloka.adapter.AdapterCoffee
import com.example.coffeeloka.data.CoffeeData
import com.example.coffeeloka.databinding.ActivityMainBinding
import com.example.coffeeloka.model.Coffee

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val listAdapter = AdapterCoffee(CoffeeData.listData)

    override fun onCreate(savedInstanceState: Bundle?) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showRecyclerView()
        findList()

    }

    private fun findList() {
        binding.edtSearch.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                filterText(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        })
    }

    private fun filterText(text : String) {
        val filteredList = ArrayList<Coffee>()

        for (item in CoffeeData.listData) {
            if (item.titleCoffee.toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item)
            }
        }
            listAdapter.filterList(filteredList)
    }

    private fun showRecyclerView() {

        binding.rvCoffee.setHasFixedSize(true)
        binding.rvCoffee.layoutManager = LinearLayoutManager(this)
        binding.rvCoffee.adapter = listAdapter
    }
}