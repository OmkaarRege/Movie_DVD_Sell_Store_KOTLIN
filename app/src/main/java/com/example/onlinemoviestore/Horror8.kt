package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror8 : AppCompatActivity() {
    val ho_8 = Horror_8()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr8)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy8)
        add.setOnClickListener {
            addHor8()
        }
    }
    private fun addHor8() {
        myCart.cart_items.add(ho_8.name)
        myCart.cart_total += ho_8.price
        ho_8.amount += ho_8.amount
        Toast.makeText(this,"${ho_8.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}