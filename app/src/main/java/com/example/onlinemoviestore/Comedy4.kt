package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy4 : AppCompatActivity() {
    val co_4 = Comedy_4()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come4)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy4)
        add.setOnClickListener {
            addCom4()
        }
    }
    private fun addCom4() {
        myCart.cart_items.add(co_4.name)
        myCart.cart_total += co_4.price
        co_4.amount += co_4.amount
        Toast.makeText(this,"${co_4.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}