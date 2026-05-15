
package com.example.gramakhata

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddCustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_customer)

        val name = findViewById<EditText>(R.id.etName)

        findViewById<Button>(R.id.btnSave).setOnClickListener {
            Toast.makeText(this, "Customer Saved: ${name.text}", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
