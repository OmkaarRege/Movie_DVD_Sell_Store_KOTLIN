package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror6 : AppCompatActivity() {
    val ho_6 = Horror_6()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr6)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy6)
        add.setOnClickListener {
            addHor6()
        }
    }
    private fun addHor6() {
        myCart.cart_items.add(ho_6.name)
        myCart.cart_total += ho_6.price
        ho_6.amount += ho_6.amount
        Toast.makeText(this,"${ho_6.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}