package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityPam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pam)

        val pamA1 = findViewById<Button>(R.id.PamB1)
        var pamAudioB1 = MediaPlayer.create(this, R.raw.pamaudio1)
        pamA1.setOnClickListener {
            pamAudioB1.start()
        }
        val pamA2 = findViewById<Button>(R.id.PamB2)
        var pamAudioB2 = MediaPlayer.create(this, R.raw.pamaudio2)
        pamA2.setOnClickListener {
            pamAudioB2.start()
        }

    }
}