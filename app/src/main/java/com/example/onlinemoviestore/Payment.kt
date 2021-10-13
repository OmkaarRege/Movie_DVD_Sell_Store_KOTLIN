package com.example.onlinemoviestore

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)


         val btncash: Button = findViewById(R.id.cash)
         val btncard: Button = findViewById(R.id.card)
         val creditno: EditText = findViewById(R.id.edcredit)
         val total: EditText = findViewById(R.id.edtotal)
         val payment: Button = findViewById(R.id.payment)
         val btnenter: Button = findViewById(R.id.btnenter)
         val s: String = myCart.cart_total.toString()
         total.setText("Total Amount: Rs $s")
         creditno.setVisibility(View.GONE)
         payment.setVisibility(View.GONE)
         btnenter.setVisibility(View.GONE)

         btncash.setOnClickListener {
             btncard.setVisibility(View.GONE)
             payment.setVisibility(View.VISIBLE)
             payment.setOnClickListener {
                 Toast.makeText(this, "Total Amount of $s : Cash on Delivery", Toast.LENGTH_LONG)
                     .show()
             }
         }
         btncard.setOnClickListener {
             btncash.setVisibility(View.GONE)
             creditno.setVisibility(View.VISIBLE)
             btnenter.setVisibility(View.VISIBLE)

             fun isNumber(str: String) = try {
                 str.toDouble()
                 true
             } catch (e: NumberFormatException) {
                 false
             }
             btnenter.setOnClickListener {
                 val p: String = creditno.text.toString()
                 if (p.length in 13..16 && isNumber(p)) {
                     payment.setVisibility(View.VISIBLE)
                     payment.setOnClickListener {
                         Toast.makeText(
                             this,
                             "Total Amount of $s : Paid By Card",
                             Toast.LENGTH_LONG
                         ).show()
                     }
                 }

                 else
                     Toast.makeText(this, "Invalid Credit Card Number", Toast.LENGTH_LONG).show()

             }

             }

     }

}