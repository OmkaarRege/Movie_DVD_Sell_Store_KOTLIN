package com.example.onlinemoviestore
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OrderedSummary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_summary)
        val itemlist : MutableList<String> = ArrayList()

        var cart_list : ListView= findViewById(R.id.cart_items)
        itemlist.add(myCart.cart_items.toString())
        cart_list.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itemlist)

        val pay : Button = findViewById(R.id.cart_total)
        pay.setOnClickListener {
            startActivity(Intent(this, Payment::class.java))
        }
    }
}