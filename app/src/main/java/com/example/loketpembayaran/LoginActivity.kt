package com.example.loketpembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val lupaKataSandi = findViewById<TextView>(R.id.lupaKataSandi)
        val masuk = findViewById<Button>(R.id.masuk)

        lupaKataSandi.setOnClickListener {
            Toast.makeText(this, "Hubungi Kantor Pusat!", Toast.LENGTH_SHORT).show()
        }
        masuk.setOnClickListener {
            val homeIntent = Intent(this, HomeActivity::class.java)
            startActivity(homeIntent)
        }
    }
}