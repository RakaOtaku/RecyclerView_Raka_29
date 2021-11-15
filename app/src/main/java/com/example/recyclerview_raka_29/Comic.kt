package com.example.recyclerview_raka_29

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Comic(
    val imgComic:Int,
    val nameComic: String,
    val descComic: String,

) : Parcelable
