package com.gramayatri.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener {

            if (username.text.toString() == "admin"
                && password.text.toString() == "1234") {

                startActivity(Intent(this, MainActivity::class.java))
                finish()

            } else {

                Toast.makeText(this,
                    "Wrong Username or Password",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}