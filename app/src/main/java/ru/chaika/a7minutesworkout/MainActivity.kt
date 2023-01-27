package ru.chaika.a7minutesworkout

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import ru.chaika.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        //  Simple binding
        //setContentView(R.layout.activity_main)

        //  New binding
        setContentView(binding?.root)

        //  Simple binding
        //val fLStartButton: FrameLayout = findViewById(R.id.flStart)

        //  New binding
        val fLStartButton: FrameLayout? = binding?.flStart

        fLStartButton?.setOnClickListener {

            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}