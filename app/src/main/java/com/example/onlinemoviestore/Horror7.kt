package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror7 : AppCompatActivity() {
    val ho_7 = Horror_7()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr7)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy7)
        add.setOnClickListener {
            addHor7()
        }
    }
    private fun addHor7() {
        myCart.cart_items.add(ho_7.name)
        myCart.cart_total += ho_7.price
        ho_7.amount += ho_7.amount
        Toast.makeText(this,"${ho_7.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}