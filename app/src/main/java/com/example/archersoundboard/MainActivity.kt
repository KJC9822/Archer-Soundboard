package com.example.archersoundboard

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val archer1 = findViewById<ImageButton>(R.id.archer_1)
         val lana1 = findViewById<ImageButton>(R.id.lana_1)
        val cheryl1 = findViewById<ImageButton>(R.id.cheryl_1)
        val krieger1 = findViewById<ImageButton>(R.id.krieger_1)
        val cyril1 = findViewById<ImageButton>(R.id.cyril_1)
        val mallory1 = findViewById<ImageButton>(R.id.mallory_1)
        val pam1 = findViewById<ImageButton>(R.id.pam_1)
        val ray1 = findViewById<ImageButton>(R.id.ray_1)

        archer1.setOnClickListener {
            val intent = Intent(this, ActivityArcher::class.java)

            startActivity(intent)
        }
        lana1.setOnClickListener {
            val intent = Intent(this, ActivityLana::class.java)

            startActivity(intent)
        }
        cheryl1.setOnClickListener {
            val intent = Intent(this, ActivityCheryl::class.java)

            startActivity(intent)
        }
        krieger1.setOnClickListener {
            val intent = Intent(this, ActivityKrieger::class.java)

            startActivity(intent)
        }
        cyril1.setOnClickListener {
            val intent = Intent(this, ActivityCyril::class.java)

            startActivity(intent)
        }
        mallory1.setOnClickListener {
            val intent = Intent(this, ActivityMallory::class.java)

            startActivity(intent)
        }
        pam1.setOnClickListener {
            val intent = Intent(this, ActivityPam::class.java)

            startActivity(intent)
        }
        ray1.setOnClickListener {
            val intent = Intent(this, ActivityRay::class.java)

            startActivity(intent)
        }
    }
}

