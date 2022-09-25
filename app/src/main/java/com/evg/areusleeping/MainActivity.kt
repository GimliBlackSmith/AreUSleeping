package com.evg.areusleeping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageBtn : ImageView = findViewById(R.id.imageView2)
        val secondText : TextView = findViewById(R.id.text_View1)
        val thirdText : TextView = findViewById(R.id.text_View3)
        val forthText : TextView = findViewById(R.id.text_View4)


        imageBtn.setOnClickListener{
            val phrases = listOf(
                "Уже 5 часов утра",
                "Вставай, мы там всё обгрызли",
                "Мы обгрызли вообще все, Жень, честно",
                "Жень, ты чё опять лежишь?",
                "Часики-то тикают",
                "Угля купил хоть себе?",
                "Уже ковать пора вообще-то"
            )
            val shuffledList = phrases.shuffled() // смешанный список

            secondText.text = shuffledList[0]
            thirdText.text = shuffledList[1]
            forthText.text = shuffledList[2]
        }



    }
}