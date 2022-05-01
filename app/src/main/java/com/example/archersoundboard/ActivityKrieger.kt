package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityKrieger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krieger)
        val kriegerA1 = findViewById<Button>(R.id.KriegerB1)
        var kriegerAudioB1 = MediaPlayer.create(this, R.raw.kriegeraudio1)
        kriegerA1.setOnClickListener {
            kriegerAudioB1.start()
        }
        val kriegerA2 = findViewById<Button>(R.id.KriegerB2)
        var kriegerAudioB2 = MediaPlayer.create(this, R.raw.kriegeraudio2)
        kriegerA2.setOnClickListener {
            kriegerAudioB2.start()
        }


    }
}