package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance8 : AppCompatActivity() {
    val ro_8 = Romance_8()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma8)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy8)
        add.setOnClickListener {
            addRom8()
        }
    }
    private fun addRom8() {
        myCart.cart_items.add(ro_8.name)
        myCart.cart_total += ro_8.price
        ro_8.amount += ro_8.amount
        Toast.makeText(this,"${ro_8.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}