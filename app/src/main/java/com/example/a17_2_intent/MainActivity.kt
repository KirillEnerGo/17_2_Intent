package com.example.a17_2_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		Log.d("LifecycleTest", "MainActivity|onCreate|${hashCode()}")

		startExplicitButton.setOnClickListener {

			val messageText = messageEditText.text.toString()

/*			// создаем переменную которая будет указывать на класс активити,
			// который мы хотим запустить
			val secondActivityIntent = Intent(
				this,
				SecondActivity::class.java // нам необх java класс, а не котлин
			).putExtra(SecondActivity.KEY_MESSAGE, messageText)
			// чтобы положить данные в интент метод putExtra
			startActivity(secondActivityIntent)
*/
			startActivity(SecondActivity.getIntent(this, messageText))
		}
	}

	override fun onStart() {
		super.onStart()
		Log.d("LifecycleTest", "MainActivity|onStart|${hashCode()}")
	}

	override fun onResume() {
		super.onResume()
		Log.d("LifecycleTest", "MainActivity|onResume|${hashCode()}")
	}

	override fun onPause() {
		super.onPause()
		Log.d("LifecycleTest", "MainActivity|onPause|${hashCode()}")
	}

	override fun onStop() {
		super.onStop()
		Log.d("LifecycleTest", "MainActivity|onStop|${hashCode()}")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d("LifecycleTest", "MainActivity|onDestroy|${hashCode()}")
	}
}