package com.example.a17_2_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		startExplicitButton.setOnClickListener {

			val messageText = messageEditText.text.toString()

			// создаем переменную которая будет указывать на класс активити,
			// который мы хотим запустить
			val secondActivityIntent = Intent(
				this,
				SecondActivity::class.java // нам необх java класс, а не котлин
			).putExtra(SecondActivity.KEY_MESSAGE, messageText)
			// чтобы положить данные в интент метод putExtra

			startActivity(secondActivityIntent)
		}
	}
}