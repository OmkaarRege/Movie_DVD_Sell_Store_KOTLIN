package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy8 : AppCompatActivity() {
    val co_8 = Comedy_8()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come8)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy8)
        add.setOnClickListener {
            addCom8()
        }
    }
    private fun addCom8() {
        myCart.cart_items.add(co_8.name)
        myCart.cart_total += co_8.price
        co_8.amount += co_8.amount
        Toast.makeText(this,"${co_8.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}