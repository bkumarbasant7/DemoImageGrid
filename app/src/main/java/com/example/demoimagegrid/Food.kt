package com.example.demoimagegrid

import android.net.Uri

class Food {
    var name: String? = null
    var image: Uri? = null

    constructor(name: String, image: Uri) {
        this.name = name
        this.image = image
    }
}