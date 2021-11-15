package com.example.recyclerview_raka_29

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComicAdapter(private val context: Context, private val comic: List<Comic>, val listener: (Comic) -> Unit)
    : RecyclerView.Adapter<ComicAdapter.ComicViewHolder>(){

    class ComicViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgKomik = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKomik = view.findViewById<TextView>(R.id.tv_item_name)
        val descKomik = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(comic: Comic, listener: (Comic) -> Unit) {
            imgKomik.setImageResource(comic.imgComic)
            nameKomik.text = comic.nameComic
            descKomik.text = comic.descComic
            itemView.setOnClickListener {
                listener(comic)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        return ComicViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_comic, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        holder.bindView(comic[position], listener)
    }

    override fun getItemCount(): Int = comic.size
    }

