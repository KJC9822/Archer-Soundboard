package com.example.archersoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ActivityCyril : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyril)
        val cyrilA1 = findViewById<Button>(R.id.CyrilB1)
        var cyrilAudioB1 = MediaPlayer.create(this, R.raw.cyrilaudio1)
        cyrilA1.setOnClickListener {
            cyrilAudioB1.start()
        }
        val cyrilA2 = findViewById<Button>(R.id.CyrilB2)
        var cyrilAudioB2 = MediaPlayer.create(this, R.raw.cyrilaudio2)
        cyrilA2.setOnClickListener {
            cyrilAudioB2.start()
        }


    }
}