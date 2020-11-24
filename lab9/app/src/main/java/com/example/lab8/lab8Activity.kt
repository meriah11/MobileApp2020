package com.example.lab8

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_lab8.*

class lab8Activity : AppCompatActivity() {
    private var websiteName : String? = null
    private var websiteURL : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab8)
        setSupportActionBar(findViewById(R.id.toolbar))

        websiteName = intent.getStringExtra("websiteName")
        websiteURL = intent.getStringExtra("websiteURL")

        websiteName?.let { Log.i("website name recieved", it) }
        websiteURL?.let { Log.i("URL revieced", it) }

        websiteName?.let {lab8TextView.text = "You want to $websiteName" }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            loadWebsite()
        }
    }

    private fun loadWebsite(){

        var intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.data = websiteURL?.let{Uri.parse(websiteURL)}

        // Verify that the intent will resolve to an activity

            startActivity(intent)

            //snackbar message

    }

    override fun onBackPressed() {
        val data = Intent()
        data.putExtra("feedback", lab8EditText.text.toString())
        setResult(Activity.RESULT_OK, data)
        super.onBackPressed()
        finish()//can be called anywhere when you want to end activity
    }
}