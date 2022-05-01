package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityMallory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mallory)

        val malloryA1 = findViewById<Button>(R.id.MaloryB1)
        var malloryAudioB1 = MediaPlayer.create(this, R.raw.maloryaudio2)
        malloryA1.setOnClickListener {
            malloryAudioB1.start()
        }
        val malloryA2 = findViewById<Button>(R.id.MaloryB2)
        var malloryAudioB2 = MediaPlayer.create(this, R.raw.maloryaudio1)
        malloryA2.setOnClickListener {
            malloryAudioB2.start()
        }

    }
}