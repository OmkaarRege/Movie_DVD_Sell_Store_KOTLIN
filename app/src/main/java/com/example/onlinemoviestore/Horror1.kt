package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror1  : AppCompatActivity() {

    val ho_1 = Horror_1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr1)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy1)
        add.setOnClickListener {
            addHor1()
        }
    }
    private fun addHor1() {
        myCart.cart_items.add(ho_1.name)
        myCart.cart_total += ho_1.price
        ho_1.amount += ho_1.amount
        Toast.makeText(this,"${ho_1.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}