package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ProductGrid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_grid)

        val horror: Button = findViewById(R.id.horror)
        val comedy: Button = findViewById(R.id.comedy)
        val romance: Button = findViewById(R.id.romance)

        horror.setOnClickListener {
            startActivity(Intent(this,Horror_Movies::class.java))
        }
        comedy.setOnClickListener {
            startActivity(Intent(this,Comedy_Movies::class.java))
        }
        romance.setOnClickListener {
            startActivity(Intent(this,Romance_Movies::class.java))
        }
    }





}