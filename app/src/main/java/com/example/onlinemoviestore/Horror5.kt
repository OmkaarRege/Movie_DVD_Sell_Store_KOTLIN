package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror5 : AppCompatActivity() {
    val ho_5 = Horror_5()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horr5)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.hbuy5)
        add.setOnClickListener {
            addHor5()
        }
    }
    private fun addHor5() {
        myCart.cart_items.add(ho_5.name)
        myCart.cart_total += ho_5.price
        ho_5.amount += ho_5.amount
        Toast.makeText(this,"${ho_5.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}