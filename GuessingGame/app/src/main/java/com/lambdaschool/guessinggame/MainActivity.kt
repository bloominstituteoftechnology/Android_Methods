package com.lambdaschool.guessinggame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var target: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_submit.setOnClickListener {
            if (button_submit.text === getString(R.string.submit_button_text)) {
                val guess = Integer.parseInt(edit_entry.text.toString())
                edit_entry.setText("")
                text_previous.text = Integer.toString(guess)
                updateUI(checkGuess(guess))
            } else {
                target = Random.nextInt(MAX_NUMBER)
                updateUI(RESET)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        target = Random.nextInt(MAX_NUMBER)
    }

    private fun checkGuess(guess: Int): Int {
        return if (guess == target) {
            CORRECT
        } else if (guess < target) {
            LOW
        } else {
            HIGH
        }
    }

    private fun updateUI(result: Int) {
        when (result) {
            CORRECT -> {
                text_message.text = "Congratulations!"
                button_submit.setText(R.string.reset_button_text)
            }
            LOW -> text_message.text = "Guess is Too Low"
            HIGH -> text_message.text = "Guess is Too High"
            RESET -> {
                button_submit.setText(R.string.submit_button_text)
                text_message.setText(R.string.prompt)
            }
        }
    }

    companion object {

        internal val MAX_NUMBER = 101
        internal val CORRECT = 0
        internal val LOW = 1
        internal val HIGH = 2
        internal val RESET = 3
    }
}
