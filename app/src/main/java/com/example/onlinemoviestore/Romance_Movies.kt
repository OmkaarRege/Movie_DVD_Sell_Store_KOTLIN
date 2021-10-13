package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Romance_Movies : AppCompatActivity() {
    internal val myCart_rom = Cart()

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.romance)
        val shop: Button = findViewById(R.id.shop3)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart3)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val rom1: Button = findViewById(R.id.romance1)
        rom1.setOnClickListener {
            startActivity(Intent(this, Romance1::class.java))
        }
        val rom2: Button = findViewById(R.id.romance2)
        rom2.setOnClickListener {
            startActivity(Intent(this, Romance2::class.java))
        }
        val rom3: Button = findViewById(R.id.romance3)
        rom3.setOnClickListener {
            startActivity(Intent(this, Romance3::class.java))
        }
        val rom4: Button = findViewById(R.id.romance4)
        rom4.setOnClickListener {
            startActivity(Intent(this, Romance4::class.java))
        }
        val rom5: Button = findViewById(R.id.romance5)
        rom5.setOnClickListener {
            startActivity(Intent(this, Romance5::class.java))
        }
        val rom6: Button = findViewById(R.id.romance6)
        rom6.setOnClickListener {
            startActivity(Intent(this, Romance6::class.java))
        }
        val rom7: Button = findViewById(R.id.romance7)
        rom7.setOnClickListener {
            startActivity(Intent(this, Romance7::class.java))
        }
        val rom8: Button = findViewById(R.id.romance8)
        rom8.setOnClickListener {
            startActivity(Intent(this,Romance8::class.java))
        }


    }


}