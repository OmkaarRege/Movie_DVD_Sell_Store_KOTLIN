package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Horror_Movies :AppCompatActivity() {
    internal val myCart_hor = Cart()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horror)
        val shop: Button = findViewById(R.id.shop1)
        shop.setOnClickListener {
            startActivity(Intent(this, ProductGrid::class.java))
        }
        val cart: Button = findViewById(R.id.cart1)
        cart.setOnClickListener {
            startActivity(Intent(this, OrderedSummary::class.java))
        }
        val hor1: Button = findViewById(R.id.horror1)
        hor1.setOnClickListener {
            startActivity(Intent(this, Horror1::class.java))
        }
        val hor2: Button = findViewById(R.id.horror2)
        hor2.setOnClickListener {
            startActivity(Intent(this, Horror2::class.java))
        }
        val hor3:Button = findViewById(R.id.horror3)
        hor3.setOnClickListener {
            startActivity(Intent(this, Horror3::class.java))
        }
        val hor4: Button = findViewById(R.id.horror4)
        hor4.setOnClickListener {
            startActivity(Intent(this, Horror4::class.java))
        }
        val hor5: Button = findViewById(R.id.horror5)
        hor5.setOnClickListener {
            startActivity(Intent(this, Horror5::class.java))
        }
        val hor6: Button = findViewById(R.id.horror6)
        hor6.setOnClickListener {
            startActivity(Intent(this, Horror6::class.java))
        }
        val hor7: Button = findViewById(R.id.horror7)
        hor7.setOnClickListener {
            startActivity(Intent(this, Horror7::class.java))
        }
        val hor8: Button = findViewById(R.id.horror8)
        hor8.setOnClickListener {
            startActivity(Intent(this, Horror8::class.java))
        }


    }
}





