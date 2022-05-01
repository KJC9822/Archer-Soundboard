package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityLana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lana)

        val lanaA1 = findViewById<Button>(R.id.LanaB1)
        var lanaAudioB1 = MediaPlayer.create(this, R.raw.lanaaudio1)
        lanaA1.setOnClickListener {
            lanaAudioB1.start()
        }
        val lanaA2 = findViewById<Button>(R.id.LanaB2)
        var lanaAudioB2 = MediaPlayer.create(this, R.raw.lanaaudio2)
        lanaA2.setOnClickListener {
            lanaAudioB2.start()
        }

    }
}