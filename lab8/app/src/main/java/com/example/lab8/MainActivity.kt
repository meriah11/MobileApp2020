package com.example.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mathFunction(view: View) {
        var coolNotCool:CharSequence = ""
        val coolNotCoolID = radioGroup.checkedRadioButtonId
        coolNotCool = findViewById<RadioButton>(coolNotCoolID).text

        messageTextView.text = "You think math is $coolNotCool"

        val addOrSub = spinner.selectedItem

        if (switch1.isChecked){
            if (addOrSub == "Addition"){
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == false){
                    messageTextView2.text = "The answer is 1"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == false){
                    messageTextView2.text = "The answer is 2"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == true){
                    messageTextView2.text = "The answer is 4"
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == false){
                    messageTextView2.text = "The answer is 3"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == true){
                    messageTextView2.text = "The answer is 6"
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == true){
                    messageTextView2.text = "The answer is 5"
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == true){
                    messageTextView2.text = "The answer is 7"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == false){
                    messageTextView2.text = "The answer is 0"
                }
            }
            if (addOrSub == "Subtraction") {
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == false) {
                    messageTextView2.text = "The answer is 1"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == false) {
                    messageTextView2.text = "The answer is 2"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == true) {
                    messageTextView2.text = "The answer is 4"
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == false) {
                    messageTextView2.text = "The answer is 1"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == true) {
                    messageTextView2.text = "The answer is 2"
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == true) {
                    messageTextView2.text = "The answer is 3"
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == true) {
                    messageTextView2.text = "The answer is 1"
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == false) {
                    messageTextView2.text = "The answer is 0"
                }
            }
        }
        else{
            messageTextView2.text = "and the answer is 10"
        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        outState.putString("message", messageTextView.toString())
//        outState.putString("message2", messageTextView2.toString())
//        super.onSaveInstanceState(outState)
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//
//    }
}

