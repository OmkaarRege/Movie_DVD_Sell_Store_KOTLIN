package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy5 : AppCompatActivity() {
    val co_5 = Comedy_5()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come5)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy5)
        add.setOnClickListener {
            addCom5()
        }
    }
    private fun addCom5() {
        myCart.cart_items.add(co_5.name)
        myCart.cart_total += co_5.price
        co_5.amount += co_5.amount
        Toast.makeText(this,"${co_5.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}