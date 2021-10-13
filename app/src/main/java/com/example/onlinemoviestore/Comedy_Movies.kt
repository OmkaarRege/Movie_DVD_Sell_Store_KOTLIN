package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Comedy_Movies : AppCompatActivity(){
    internal val myCart_com = Cart()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comedy)
        val shop: Button = findViewById(R.id.shop2)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart2)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val com1: Button = findViewById(R.id.comedy1)
        com1.setOnClickListener {
            startActivity(Intent(this, Comedy1::class.java))
        }
        val com2: Button = findViewById(R.id.comedy2)
        com2.setOnClickListener {
            startActivity(Intent(this, Comedy2::class.java))
        }
        val com3: Button = findViewById(R.id.comedy3)
        com3.setOnClickListener {
            startActivity(Intent(this, Comedy3::class.java))
        }
        val com4: Button = findViewById(R.id.comedy4)
        com4.setOnClickListener {
            startActivity(Intent(this, Comedy4::class.java))
        }
        val com5: Button = findViewById(R.id.comedy5)
        com5.setOnClickListener {
            startActivity(Intent(this, Comedy5::class.java))
        }
        val com6: Button = findViewById(R.id.comedy6)
        com6.setOnClickListener {
            startActivity(Intent(this, Comedy6::class.java))
        }
        val com7: Button = findViewById(R.id.comedy7)
        com7.setOnClickListener {
            startActivity(Intent(this, Comedy7::class.java))
        }
        val com8: Button = findViewById(R.id.comedy8)
        com8.setOnClickListener {
            startActivity(Intent(this, Comedy8::class.java))
        }
    }
}


