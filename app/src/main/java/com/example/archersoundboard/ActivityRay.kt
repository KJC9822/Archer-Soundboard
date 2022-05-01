package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityRay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ray)
        val rayA1 = findViewById<Button>(R.id.RayB1)
        var rayAudioB1 = MediaPlayer.create(this, R.raw.rayaudio1)
        rayA1.setOnClickListener {
            rayAudioB1.start()
        }
        val rayA2 = findViewById<Button>(R.id.RayB2)
        var rayAudioB2 = MediaPlayer.create(this, R.raw.rayaudio2)
        rayA2.setOnClickListener {
            rayAudioB2.start()
        }


    }
}