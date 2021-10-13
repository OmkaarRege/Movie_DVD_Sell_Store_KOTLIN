package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy6 : AppCompatActivity() {
    val co_6 = Comedy_6()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come6)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy6)
        add.setOnClickListener {
            addCom6()
        }
    }
    private fun addCom6() {
        myCart.cart_items.add(co_6.name)
        myCart.cart_total += co_6.price
        co_6.amount += co_6.amount
        Toast.makeText(this,"${co_6.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}