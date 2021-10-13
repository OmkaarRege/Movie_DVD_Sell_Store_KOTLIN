package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance7 : AppCompatActivity() {
    val ro_7 = Romance_7()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma7)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy7)
        add.setOnClickListener {
            addRom7()
        }
    }
    private fun addRom7() {
        myCart.cart_items.add(ro_7.name)
        myCart.cart_total += ro_7.price
        ro_7.amount += ro_7.amount
        Toast.makeText(this,"${ro_7.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}