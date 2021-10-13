package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance1 : AppCompatActivity() {
    val ro_1 = Romance_1()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma1)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy1)
        add.setOnClickListener {
            addRom1()
        }
    }
    private fun addRom1() {
        myCart.cart_items.add(ro_1.name)
        myCart.cart_total += ro_1.price
        ro_1.amount += ro_1.amount
        Toast.makeText(this,"${ro_1.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}