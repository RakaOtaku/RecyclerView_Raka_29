package com.example.recyclerview_raka_29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comicList = listOf<Comic>(
            Comic(
                R.drawable.blue,
                    nameComic = "Blue Lock",
                    descComic = "Komik tentang projek negara Jepang untuk menyiptakan seorang striker dengan 'ego' dan rasa haus gol yang tinggi"
            ),
            Comic(
                R.drawable.orv,
                nameComic = "Omniscient Reader Viewpoint",
                descComic = "Komik tentang seorang pembaca novel yang secara tiba tiba dunia nya berubah menjadi seperti novel yang Ia baca"
            ),
            Comic(
                R.drawable.noblese,
                nameComic = "Noblesse",
                descComic = "Komik tentang seorang 'Noblesse' bernama Raizel yang baru terbangun setelah tidur selama 820 tahun dan beradaptasi dengan era baru"
            ),
            Comic(
                R.drawable.rankers,
                nameComic = "Ranker Return",
                descComic = "Komik tentang seorang Ranker atau Top Player yang pensiun, tetapi karena suatu aalasan dia kembali bermain menggunakan akun baru"
            ),
            Comic(
                R.drawable.second,
                nameComic = "Ranker Who Lives Twice",
                descComic = "Komik tentang seorang kakak yang ingin membalaskan dendam adiknya yang telah mati karena dikhianati 12 orang kepercayaannya"
            ),
            Comic(
                R.drawable.solo,
                nameComic = "Solo Leveling",
                descComic = "Komik tentang seorang hunter terlemah di dunia yang berubah menjadi hunter terkuat di dunia"
            )


        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_code)
        val horizontalLayoutManagaer =
            LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ComicAdapter(this, comicList){
            val intent = Intent(this, DetailComicActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}