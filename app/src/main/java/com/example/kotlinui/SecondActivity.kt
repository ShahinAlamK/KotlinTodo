package com.example.kotlinui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SecondActivity : AppCompatActivity() {

    private lateinit var viewText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username = intent.getStringExtra("name")
        viewText = findViewById(R.id.userViewId)
        viewText.text = username

    }
}