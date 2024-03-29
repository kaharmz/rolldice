package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImages : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialization view
        diceImage = findViewById(R.id.dice_image)
        diceImages = findViewById(R.id.dice_images)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandomDice())
        diceImages.setImageResource(getRandomDice())
    }

    private fun getRandomDice() : Int {
        return when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
