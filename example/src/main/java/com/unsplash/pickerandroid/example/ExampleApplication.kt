package com.unsplash.pickerandroid.example

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "2RfRUSu8XSCsV1Vhs997bVT_XQ6dJ1_a46kYgyFiHH8",
            "D5Jygm5DHsi5Y3ol1Y3WaiKomzIXYsia897fkWHh1EE"
            /* optional page size (number of photos per page) */
            //, 5
        )
             //.setLoggingEnabled(true) // if you want to see the http requests
    }
}
