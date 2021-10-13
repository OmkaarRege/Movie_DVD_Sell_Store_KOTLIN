package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy3 : AppCompatActivity() {
    val co_3 = Comedy_3()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come3)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.cbuy3)
        add.setOnClickListener {
            addCom3()
        }
    }
    private fun addCom3() {
        myCart.cart_items.add(co_3.name)
        myCart.cart_total += co_3.price
        co_3.amount += co_3.amount
        Toast.makeText(this,"${co_3.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}