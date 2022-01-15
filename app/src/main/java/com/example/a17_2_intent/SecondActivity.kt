package com.example.a17_2_intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity(R.layout.activity_second) {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val message = intent.getStringExtra(KEY_MESSAGE)
		messageTextView.text = message
	}

	companion object{
		const val KEY_MESSAGE = "message key"
	}
}