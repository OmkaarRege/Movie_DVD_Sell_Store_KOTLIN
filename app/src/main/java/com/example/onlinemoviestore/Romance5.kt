package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance5 : AppCompatActivity() {
    val ro_5 = Romance_5()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma5)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy5)
        add.setOnClickListener {
            addRom5()
        }
    }
    private fun addRom5() {
        myCart.cart_items.add(ro_5.name)
        myCart.cart_total += ro_5.price
        ro_5.amount += ro_5.amount
        Toast.makeText(this,"${ro_5.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}