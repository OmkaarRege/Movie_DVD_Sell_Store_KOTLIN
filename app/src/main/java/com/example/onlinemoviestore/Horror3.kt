package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror3 : AppCompatActivity() {
    val ho_3 = Horror_3()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr3)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy3)
        add.setOnClickListener {
            addHor3()
        }
    }
    private fun addHor3() {
        myCart.cart_items.add(ho_3.name)
        myCart.cart_total += ho_3.price
        ho_3.amount += ho_3.amount
        Toast.makeText(this,"${ho_3.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}