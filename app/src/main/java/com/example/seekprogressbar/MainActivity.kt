package com.example.seekprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // images

    val img1 = findViewById<ImageView>(R.id.imageView3)
    val img2 = findViewById<ImageView>(R.id.imageView4)
    val img3 = findViewById<ImageView>(R.id.imageView6)
    val btn = findViewById<Button>(R.id.button)

    // width
    val seekbar1 = findViewById<SeekBar>(R.id.widthseek1)
    val seekbar2 = findViewById<SeekBar>(R.id.widthseek2)
    val seekbar3 = findViewById<SeekBar>(R.id.widthseek3)

    // height

    val seekbar4 = findViewById<SeekBar>(R.id.heightseek1)
    val seekbar5 = findViewById<SeekBar>(R.id.heightseek2)
    val seekbar6 = findViewById<SeekBar>(R.id.heightseek3)

    // Progess Bar

    val pb1 = findViewById<ProgressBar>(R.id.progressBar)
    val pb2 = findViewById<ProgressBar>(R.id.progressBar2)
}