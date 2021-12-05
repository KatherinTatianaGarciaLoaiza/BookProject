package com.ktatiana.bookproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameBookEditText : EditText = findViewById(R.id.name_book_edit_text)
        val nameAuthorEditText : EditText = findViewById(R.id.name_author_edit_text)
        val pagesEditText : EditText = findViewById(R.id.pages_edit_text)
        val abstractEditText : EditText = findViewById(R.id.abstract_edit_text)
        val saveButton : Button = findViewById(R.id.save_button)
        val infoTextView : TextView = findViewById(R.id.info_text_view)

        saveButton.setOnClickListener{
            val nameBook : String = nameBookEditText.text.toString()
            val author : String =  nameAuthorEditText.text.toString()
            val pages : String = pagesEditText.text.toString()
            val abstract : String = abstractEditText.text.toString()
            infoTextView.text = "Nombre : " + nameBook + '\n' + "Autor : " +  author + '\n' + "Número de páginas : " + pages + '\n' + "Resumen : " + abstract

        }
    }


}