package com.example.kotlinui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var inputText: EditText
    private lateinit var todoAdepter: TodoAdepter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton = findViewById(R.id.addButton)
        inputText = findViewById(R.id.todoInput)

        addButton.setOnClickListener {
            val valueText = inputText.text.toString()
            if (valueText.isNotEmpty()){
                val todo = TodoModel(valueText,false)
                inputText.text.clear()
            }
        }

    }
}