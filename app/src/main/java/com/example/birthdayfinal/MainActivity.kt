package com.example.birthdayfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {

        val nae= findViewById<EditText>(R.id.nameInput)
        val name= nae.editableText.toString()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)

        startActivity(intent)
    }
}



