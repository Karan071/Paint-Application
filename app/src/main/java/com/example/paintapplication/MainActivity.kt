package com.example.paintapplication

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapplication.CustomPaint.Companion.colorList
import com.example.paintapplication.CustomPaint.Companion.currentBrush
import com.example.paintapplication.CustomPaint.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{ // using companion object we can access through out the application
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn = findViewById<ImageButton>(R.id.redButton)
        val blueBtn = findViewById<ImageButton>(R.id.blueButton)
        val blackBtn = findViewById<ImageButton>(R.id.blackButton)
        val eraserBtn = findViewById<ImageButton>(R.id.eraserButton)

        redBtn.setOnClickListener {
            Toast.makeText(this, "Picked Red Color", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            Toast.makeText(this, "Picked Blue Color", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener {
            Toast.makeText(this, "Picked Black Color", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        eraserBtn.setOnClickListener {
            Toast.makeText(this, "Picked Eraser", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }

    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }

}