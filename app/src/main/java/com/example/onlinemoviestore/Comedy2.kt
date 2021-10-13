package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy2 : AppCompatActivity() {
    val co_2 = Comedy_2()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come2)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy2)
        add.setOnClickListener {
            addCom2()
        }
    }
    private fun addCom2() {
        myCart.cart_items.add(co_2.name)
        myCart.cart_total += co_2.price
        co_2.amount += co_2.amount
        Toast.makeText(this,"${co_2.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}