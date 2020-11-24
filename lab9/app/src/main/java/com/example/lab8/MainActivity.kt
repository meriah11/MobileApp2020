package com.example.lab8

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_lab8.*

class MainActivity : AppCompatActivity() {
    private var website = newDataClass();
    private var selectedSpinnerPosition = 0
    private val REQUEST_CODE = 1
    var cool: String = ""
    var answerToMath: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findWebsiteButton.setOnClickListener{
            selectedSpinnerPosition = spinner2.selectedItemPosition
            website.findWebsite(selectedSpinnerPosition)
            Log.i("website suggested", website.name);
            Log.i("URL suggested", website.url);

            val intent = Intent(this, lab8Activity::class.java)
            intent.putExtra("websiteName", website.name)
            intent.putExtra("websiteURL", website.url)

            //startActivity(intent)
            startActivityForResult(intent, REQUEST_CODE)
        }

    }

    fun mathFunction(view: View) {
        var coolNotCool:CharSequence = ""
        val coolNotCoolID = radioGroup.checkedRadioButtonId
        coolNotCool = findViewById<RadioButton>(coolNotCoolID).text

        cool = "You think math is $coolNotCool"

        messageTextView.text = cool

        val addOrSub = spinner.selectedItem

        if (switch1.isChecked){
            if (addOrSub == "Addition"){
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == false){
                    answerToMath = "The anser is 1"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == false){
                    answerToMath = "The answer is 2"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == true){
                    answerToMath = "The answer is 4"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == false){
                    answerToMath = "The answer is 3"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == true){
                    answerToMath = "The answer is 6"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == true){
                    answerToMath = "The answer is 5"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == true){
                    answerToMath =  "The answer is 7"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == false){
                    answerToMath = "The answer is 0"
                    messageTextView2.text = answerToMath
                }
            }
            if (addOrSub == "Subtraction") {
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == false) {
                    answerToMath = "The answer is 1"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == false) {
                    answerToMath = "The answer is 2"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == true) {
                    answerToMath = "The answer is 4"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == false) {
                    answerToMath = "The answer is 1"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == true && checkBox3.isChecked == true) {
                    answerToMath = "The answer is 2"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == false && checkBox3.isChecked == true) {
                    answerToMath = "The answer is 3"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == true && checkBox2.isChecked == true && checkBox3.isChecked == true) {
                    answerToMath = "The answer is 1"
                    messageTextView2.text = answerToMath
                }
                if (checkBox.isChecked == false && checkBox2.isChecked == false && checkBox3.isChecked == false) {
                    answerToMath = "The answer is 0"
                    messageTextView2.text = answerToMath
                }
            }
        }
        else{
            answerToMath = "and the anser is 10"
            messageTextView2.text = answerToMath
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if ((requestCode == REQUEST_CODE) && resultCode == Activity.RESULT_OK){
            messageTextView.setText(data?.let{data.getStringExtra("feedback")})
        }
    }

    fun updateUI(){
        //TextView
        messageTextView.text = cool
        //ImageView
        messageTextView2.text = answerToMath
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("message", answerToMath)
        outState.putString("message2", cool)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        answerToMath = savedInstanceState.getString("message", "")
        cool = savedInstanceState.getString("message2", "")
        updateUI()

    }
}

