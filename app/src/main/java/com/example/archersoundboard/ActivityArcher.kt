package com.example.archersoundboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.widget.Button


class ActivityArcher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archer)
        val archerA1 = findViewById<Button>(R.id.ArcherB1)
        var archerAudioB1 = MediaPlayer.create(this, R.raw.archeraudio1)
        archerA1.setOnClickListener {
            archerAudioB1.start()
            }
        val archerA2 = findViewById<Button>(R.id.ArcherB2)
        var archerAudioB2 = MediaPlayer.create(this, R.raw.archeraudio2)
        archerA2.setOnClickListener {
            archerAudioB2.start()
        }
        val archerA3 = findViewById<Button>(R.id.ArcherB3)
        var archerAudioB3 = MediaPlayer.create(this, R.raw.archeraudio3)
        archerA3.setOnClickListener {
            archerAudioB3.start()
        }
        }

    }





