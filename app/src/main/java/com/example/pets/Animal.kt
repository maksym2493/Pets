package com.example.pets

import android.os.Parcelable
import com.example.pets.databinding.ActivityMainBinding
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animal(val name: String, val description: String, val fullDescription: String, var image: Int): Parcelable