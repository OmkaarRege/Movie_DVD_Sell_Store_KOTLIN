package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance4 : AppCompatActivity() {
    val ro_4 = Romance_4()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma4)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy4)
        add.setOnClickListener {
            addRom4()
        }
    }
    private fun addRom4() {
        myCart.cart_items.add(ro_4.name)
        myCart.cart_total += ro_4.price
        ro_4.amount += ro_4.amount
        Toast.makeText(this,"${ro_4.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}