package com.example.madpractical6_20012021009

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YouTubeActivity : AppCompatActivity() {
    private val youtubeId = "TYBG36kEQ1U"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        val mywebview = findViewById<WebView>(R.id.webview)
        var playbttn = findViewById<FloatingActionButton>(R.id.playbt)

        playbttn.setOnClickListener(){
            Intent(this,MainActivity::class.java).apply {
                startActivity(this)
            }
        }

        val webSettings: WebSettings = mywebview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}