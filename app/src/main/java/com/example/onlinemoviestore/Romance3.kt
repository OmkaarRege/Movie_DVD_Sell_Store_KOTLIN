package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance3 : AppCompatActivity() {
    val ro_3 = Romance_3()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roma3)


        val shop: Button = findViewById(R.id.shop)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val add: Button = findViewById(R.id.rbuy3)
        add.setOnClickListener {
            addRom3()
        }
    }
    private fun addRom3() {
        myCart.cart_items.add(ro_3.name)
        myCart.cart_total += ro_3.price
        ro_3.amount += ro_3.amount
        Toast.makeText(this,"${ro_3.name} has been added to cart", Toast.LENGTH_LONG).show()

    }
}