package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror2 : AppCompatActivity() {
    val ho_2 = Horror_2()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr2)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy2)
        add.setOnClickListener {
            addHor2()
        }
    }
    private fun addHor2() {
        myCart.cart_items.add(ho_2.name)
        myCart.cart_total += ho_2.price
        ho_2.amount += ho_2.amount
        Toast.makeText(this,"${ho_2.name} has been added to cart", Toast.LENGTH_LONG).show()

    }

}