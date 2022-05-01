package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityCheryl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheryl)
        val cherylA1 = findViewById<Button>(R.id.CherylB1)
        var cherylAudioB1 = MediaPlayer.create(this, R.raw.cherylaudio1)
        cherylA1.setOnClickListener {
            cherylAudioB1.start()
        }
        val cherylA2 = findViewById<Button>(R.id.CherylB2)
        var cherylAudioB2 = MediaPlayer.create(this, R.raw.cherylaudio2)
        cherylA2.setOnClickListener {
            cherylAudioB2.start()
        }


    }
}