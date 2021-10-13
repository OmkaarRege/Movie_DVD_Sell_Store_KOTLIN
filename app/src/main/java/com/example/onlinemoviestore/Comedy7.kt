package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy7 : AppCompatActivity() {
    val co_7 = Comedy_7()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come7)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy7)
        add.setOnClickListener {
            addCom7()
        }
    }
    private fun addCom7() {
        myCart.cart_items.add(co_7.name)
        myCart.cart_total += co_7.price
        co_7.amount += co_7.amount
        Toast.makeText(this,"${co_7.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}