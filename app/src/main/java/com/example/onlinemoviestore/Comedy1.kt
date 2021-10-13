package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy1 : AppCompatActivity() {
    val co_1 = Comedy_1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come1)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy1)
        add.setOnClickListener {
            addCom1()
        }
    }
    private fun addCom1() {
        myCart.cart_items.add(co_1.name)
        myCart.cart_total += co_1.price
        co_1.amount += co_1.amount
        Toast.makeText(this,"${co_1.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}