package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance6 : AppCompatActivity() {
    val ro_6 = Romance_6()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma6)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy6)
        add.setOnClickListener {
            addRom6()
        }
    }
    private fun addRom6() {
        myCart.cart_items.add(ro_6.name)
        myCart.cart_total += ro_6.price
        ro_6.amount += ro_6.amount
        Toast.makeText(this,"${ro_6.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}