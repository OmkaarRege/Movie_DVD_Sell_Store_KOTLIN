package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance2 : AppCompatActivity() {
    val ro_2 = Romance_2()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma2)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy2)
        add.setOnClickListener {
            addRom2()
        }
    }
    private fun addRom2() {
        myCart.cart_items.add(ro_2.name)
        myCart.cart_total += ro_2.price
        ro_2.amount += ro_2.amount
        Toast.makeText(this,"${ro_2.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}