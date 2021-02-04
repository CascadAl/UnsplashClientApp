package com.unsplash.pickerandroid.photopicker.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.unsplash.pickerandroid.photopicker.R
import kotlinx.android.synthetic.main.activity_detail_unsplash_picker.*
import kotlinx.android.synthetic.main.activity_image_show.*

class DetailUnsplashPickerActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_unsplash_picker)

        val name = intent.getStringExtra(EXTRA_NAME)
        val userName = intent.getStringExtra(EXTRA_USERNAME)
        val url = intent.getStringExtra(EXTRA_URL)
        val location = intent.getStringExtra(EXTRA_LOCATION)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val likes = intent.getStringExtra(EXTRA_LIKES)


        tvUserName.text = name
        tvUserLink.text = "@$userName"
        Picasso.get().load(url)
            .into(ivPicture)
        tvLocation.text = if (location == "null") "" else location
        tvDesc.text = if (description == "null") "" else description
        tvLikes.text = if (likes == "null") "" else "$likes likes"
    }


    companion object {
        private const val EXTRA_NAME = "EXTRA_NAME"
        private const val EXTRA_USERNAME = "EXTRA_USERNAME"
        private const val EXTRA_LOCATION = "EXTRA_LOCATION"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"
        private const val EXTRA_LIKES = "EXTRA_LIKES"
        private const val EXTRA_URL = "EXTRA_URL"

        fun getStartingIntent(context: Context, name: String, username: String, location: String, description: String, likes: String, url: String) : Intent {
            val intent = Intent(context, DetailUnsplashPickerActivity::class.java)

            intent.putExtra(EXTRA_NAME, name)
            intent.putExtra(EXTRA_USERNAME, username)
            intent.putExtra(EXTRA_LOCATION, location)
            intent.putExtra(EXTRA_DESCRIPTION, description)
            intent.putExtra(EXTRA_LIKES, likes)
            intent.putExtra(EXTRA_URL, url)

            return intent
        }
    }
}