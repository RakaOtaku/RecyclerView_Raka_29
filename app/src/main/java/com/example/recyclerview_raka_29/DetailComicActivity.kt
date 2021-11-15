package com.example.recyclerview_raka_29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailComicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_comic)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val code = intent.getParcelableExtra<Comic>(MainActivity.INTENT_PARCELABLE)

        val imgCode = findViewById<ImageView>(R.id.img_item_photo)
        val nameCode = findViewById<TextView>(R.id.tv_item_name)
        val descCode = findViewById<TextView>(R.id.tv_item_description)

        imgCode.setImageResource(code?.imgComic!!)
        nameCode.text = code.nameComic
        descCode.text = code.descComic

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}