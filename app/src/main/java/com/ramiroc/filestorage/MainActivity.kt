package com.ramiroc.filestorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Environment.DIRECTORY_DOCUMENTS
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrieveButton = findViewById<Button>(R.id.retrieveBttn)

        retrieveButton.setOnClickListener {
            val externalStorageLocation = Environment.getExternalStoragePublicDirectory(DIRECTORY_DOCUMENTS)

            val locationString = "External files are stored at $externalStorageLocation"

            textView!!.text = locationString
        }

        textView = findViewById(R.id.externalStorage) as TextView
    }

    
}