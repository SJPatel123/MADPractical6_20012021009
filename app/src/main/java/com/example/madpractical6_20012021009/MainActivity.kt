package com.example.madpractical6_20012021009


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myvideoview = findViewById<VideoView>(R.id.videoview)
        val playbutton = findViewById<FloatingActionButton>(R.id.playbtn)

        playbutton.setOnClickListener(){
            Intent(this,YouTubeActivity::class.java).apply{
                startActivity(this)
            }
        }

        val mediaController = MediaController(this)
        val uri : Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
    }
}