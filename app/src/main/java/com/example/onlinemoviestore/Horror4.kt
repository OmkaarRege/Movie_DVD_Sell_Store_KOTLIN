package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror4 : AppCompatActivity() {
    val ho_4 = Horror_4()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr4)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy4)
        add.setOnClickListener {
            addHor4()
        }
    }
    private fun addHor4() {
        myCart.cart_items.add(ho_4.name)
        myCart.cart_total += ho_4.price
        ho_4.amount += ho_4.amount
        Toast.makeText(this,"${ho_4.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}