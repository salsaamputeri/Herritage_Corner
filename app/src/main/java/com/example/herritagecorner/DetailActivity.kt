package com.example.herritagecorner

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Batik = intent.getParcelableExtra<BatikClass>(MainActivity.INTENT_PARCELABLE)

        val batikimg = findViewById<ImageView>(R.id.image)
        val namabatik = findViewById<TextView>(R.id.tv_name)
        val deskbatik = findViewById<TextView>(R.id.tv_desk)
        val tambahan = findViewById<TextView>(R.id.tv_tambahan)


        batikimg.setImageResource(Batik?.batikimg!!)
        namabatik.text = Batik.namabatik
        deskbatik.text = Batik.deskbatik
        tambahan.text = Batik.tambahan

        val buttonOpenLink = findViewById<Button>(R.id.buttonOpenLink)
        buttonOpenLink.setOnClickListener {
            val url = "https://www.kratonjogja.id/kagungan-dalem/12-motif-batik-larangan-keraton-yogyakarta/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val buttontravel = findViewById<Button>(R.id.buttontravel)
        buttontravel.setOnClickListener {
            val url = "https://ullensentalu.com/index.html"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}