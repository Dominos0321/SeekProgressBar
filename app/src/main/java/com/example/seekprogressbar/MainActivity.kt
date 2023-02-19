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


        // images

        val img1 = findViewById<ImageView>(R.id.imageView3)
        val img2 = findViewById<ImageView>(R.id.imageView4)
        val img3 = findViewById<ImageView>(R.id.imageView6)
        val btn = findViewById<Button>(R.id.button)

        // width
        val widthbar1 = findViewById<SeekBar>(R.id.widthseek1)
        val widthbar2 = findViewById<SeekBar>(R.id.widthseek2)
        val widthbar3 = findViewById<SeekBar>(R.id.widthseek3)

        // height

        val heightbar1 = findViewById<SeekBar>(R.id.heightseek1)
        val heightbar2 = findViewById<SeekBar>(R.id.heightseek2)
        val heightbar3 = findViewById<SeekBar>(R.id.heightseek3)


        // Progess Bar

        val widthBars = findViewById<ProgressBar>(R.id.WBar)
        val heightBars = findViewById<ProgressBar>(R.id.HBar)

        // Functions width , height
        fun width() {
            widthBars.progress = (widthbar1.progress + widthbar2.progress + widthbar3.progress) / 3
        }

        fun height() {
            heightBars.progress = (heightbar1.progress + heightbar2.progress + heightbar3.progress) / 3
        }

        // Reset Button

        val resetbtn = findViewById<Button>(R.id.button)

        resetbtn.setOnClickListener {
            widthbar1.progress = 100
            widthbar2.progress = 100
            widthbar3.progress = 100
            heightbar1.progress = 100
            heightbar2.progress = 100
            heightbar3.progress = 100

            widthBars.progress = 100
            heightBars.progress = 100

        }

        // img1
        widthbar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img1.scaleX = progress.toFloat() / 100f
                width()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        heightbar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img1.scaleY = progress.toFloat() / 100f
                height()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // img2
        widthbar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img2.scaleX = progress.toFloat() / 100f
                width()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        heightbar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img2.scaleY = progress.toFloat() / 100f
                height()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // img3
        widthbar3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img3.scaleX = progress.toFloat() / 100f
                width()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        heightbar3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img3.scaleY = progress.toFloat() / 100f
                height()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}