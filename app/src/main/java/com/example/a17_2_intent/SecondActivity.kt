package com.example.a17_2_intent

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity(R.layout.activity_second) {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Log.d("LifecycleTest", "SeconActivity|onCreate|${hashCode()}")
		val message = intent.getStringExtra(KEY_MESSAGE)
		messageTextView.text = message
	}

	override fun onStart() {
		super.onStart()
		Log.d("LifecycleTest", "SeconActivity|onStart|${hashCode()}")
	}

	override fun onResume() {
		super.onResume()
		Log.d("LifecycleTest", "SeconActivity|onResume|${hashCode()}")
	}

	override fun onPause() {
		super.onPause()
		Log.d("LifecycleTest", "SeconActivity|onPause|${hashCode()}")
	}

	override fun onStop() {
		super.onStop()
		Log.d("LifecycleTest", "SeconActivity|onStop|${hashCode()}")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d("LifecycleTest", "SeconActivity|onDestroy|${hashCode()}")
	}

	companion object{
		const val KEY_MESSAGE = "message key"

		fun getIntent(context: Context, message: String?): Intent
		{
			return Intent(context, SecondActivity::class.java)
				.putExtra(KEY_MESSAGE, message)
		}
	}
}