package com.example.finalandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.View
import android.widget.*
import org.w3c.dom.Text
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
//    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHyperlink()
    }

    private fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.food1)
        val linkTextView2 = findViewById<TextView>(R.id.food2)
        val linkTextView3 = findViewById<TextView>(R.id.food3)
        val linkTextView4 = findViewById<TextView>(R.id.food4)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance())
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance())
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance())
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance())
    }

    fun chooseFood(view: View) {
        val foodSelectionID = radioGroup1.checkedRadioButtonId
        val foodSelection = findViewById<RadioButton>(foodSelectionID).text





        if (foodSelection == "Chicken"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.food1String)
//            val saveText1 = foodChange1

            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.food2String)
//            val saveText2 = foodChange2

            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.food3String)
//            val saveText3 = foodChange3

            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.foodString4)
//            val saveText4 = foodChange4

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.orangechicken)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.chickenbreast)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.chickenparm)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.garlicchicken)
        }
        if (foodSelection == "Pasta"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.pastaString1)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.pastaString2)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.pastaString3)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.pastaString4)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.spaghetti)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.alfredo)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.butter)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.pesto)
        }
        if (foodSelection == "Seafood"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.seafoodString1)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.seafoodString2)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.seafoodString3)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.seafoodString4)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.salmon)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.friedshrimp)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.cajun)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.fishtacos)
        }
        if (foodSelection == "Red Meat"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.meatString1)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.meatString2)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.meatString3)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.meatString4)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.steak)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.steakfajitas)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.brocolibeef)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.burger)
        }


    }

    fun moreChoices(view: View) {
        var count = 0
        count++

//        if (count == 3){
//            count = 0
//        }

        val foodSelectionID = radioGroup1.checkedRadioButtonId
        val foodSelection = findViewById<RadioButton>(foodSelectionID).text

        if (count == 0 && foodSelection == "Chicken"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.food1String)
//            val saveText1 = foodChange1

            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.food2String)
//            val saveText2 = foodChange2

            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.food3String)
//            val saveText3 = foodChange3

            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.foodString4)
//            val saveText4 = foodChange4

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.orangechicken)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.chickenbreast)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.chickenparm)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.garlicchicken)
        }
        if (count == 1 && foodSelection == "Chicken"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.foodString5)
//            val saveText1 = foodChange1

            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.foodString6)
//            val saveText2 = foodChange2

            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.foodString7)
//            val saveText3 = foodChange3

            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.foodString8)
//            val saveText4 = foodChange4

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.greekskewers)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.sweetchicken)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.potpie)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.breadedchicken)
        }
//        if (count == 2 && foodSelection == "Chicken"){
//            val foodChange1 = findViewById<TextView>(R.id.food1)
//            foodChange1.setText(R.string.foodString9)
////            val saveText1 = foodChange1
//
//            val foodChange2 = findViewById<TextView>(R.id.food2)
//            foodChange2.setText(R.string.foodString10)
////            val saveText2 = foodChange2
//
//            val foodChange3 = findViewById<TextView>(R.id.food3)
//            foodChange3.setText(R.string.foodString11)
////            val saveText3 = foodChange3
//
//            val foodChange4 = findViewById<TextView>(R.id.food4)
//            foodChange4.setText(R.string.foodString12)
////            val saveText4 = foodChange4
//
//            val image1 = findViewById<ImageView>(R.id.imageView5)
//            image1.setImageResource(R.drawable.wings)
//            val image2 = findViewById<ImageView>(R.id.imageView6)
//            image2.setImageResource(R.drawable.weirdchicken)
//            val image3 = findViewById<ImageView>(R.id.imageView7)
//            image3.setImageResource(R.drawable.enchiladas)
//            val image4 = findViewById<ImageView>(R.id.imageView8)
//            image4.setImageResource(R.drawable.marsala)
//        }
        if (count == 0 && foodSelection == "Pasta"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.pastaString1)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.pastaString2)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.pastaString3)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.pastaString4)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.spaghetti)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.alfredo)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.butter)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.pesto)
        }
        if (count == 1 && foodSelection == "Pasta"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.pastaString5)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.pastaString6)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.pastaString7)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.pastaString8)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.padthai)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.withlemon)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.tomatoandspin)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.vodka)
        }
//        if (count == 2 && foodSelection == "Pasta"){
//            val foodChange1 = findViewById<TextView>(R.id.food1)
//            foodChange1.setText(R.string.pastaString9)
//            val foodChange2 = findViewById<TextView>(R.id.food2)
//            foodChange2.setText(R.string.pastaString10)
//            val foodChange3 = findViewById<TextView>(R.id.food3)
//            foodChange3.setText(R.string.pastaString11)
//            val foodChange4 = findViewById<TextView>(R.id.food4)
//            foodChange4.setText(R.string.pastaString12)
//
//            val image1 = findViewById<ImageView>(R.id.imageView5)
//            image1.setImageResource(R.drawable.carbonara)
//            val image2 = findViewById<ImageView>(R.id.imageView6)
//            image2.setImageResource(R.drawable.alfredo)
//            val image3 = findViewById<ImageView>(R.id.imageView7)
//            image3.setImageResource(R.drawable.bakedspaghetti)
//            val image4 = findViewById<ImageView>(R.id.imageView8)
//            image4.setImageResource(R.drawable.beefragu)
//        }
        if (count == 0 && foodSelection == "Seafood"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.seafoodString1)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.seafoodString2)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.seafoodString3)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.seafoodString4)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.salmon)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.friedshrimp)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.cajun)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.fishtacos)
        }
        if (count == 1 && foodSelection == "Seafood"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.seafoodString5)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.seafoodString6)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.seafoodString7)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.seafoodString8)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.salmoncake)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.shrimpscampi)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.fishsteaks)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.coconoutshrimp)
        }
//        if (count == 2 && foodSelection == "Seafood"){
//            val foodChange1 = findViewById<TextView>(R.id.food1)
//            foodChange1.setText(R.string.seafoodString9)
//            val foodChange2 = findViewById<TextView>(R.id.food2)
//            foodChange2.setText(R.string.seafoodString10)
//            val foodChange3 = findViewById<TextView>(R.id.food3)
//            foodChange3.setText(R.string.seafoodString11)
//            val foodChange4 = findViewById<TextView>(R.id.food4)
//            foodChange4.setText(R.string.seafoodString12)
//
//            val image1 = findViewById<ImageView>(R.id.imageView5)
//            image1.setImageResource(R.drawable.bakedscallops)
//            val image2 = findViewById<ImageView>(R.id.imageView6)
//            image2.setImageResource(R.drawable.tilapia)
//            val image3 = findViewById<ImageView>(R.id.imageView7)
//            image3.setImageResource(R.drawable.fishsteaks)
//            val image4 = findViewById<ImageView>(R.id.imageView8)
//            image4.setImageResource(R.drawable.coconoutshrimp)
//        }
        if (count == 0 && foodSelection == "Red Meat"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.meatString1)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.meatString2)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.meatString3)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.meatString4)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.steak)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.steakfajitas)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.brocolibeef)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.burger)
        }
        if (count == 1 && foodSelection == "Red Meat"){
            val foodChange1 = findViewById<TextView>(R.id.food1)
            foodChange1.setText(R.string.meatString5)
            val foodChange2 = findViewById<TextView>(R.id.food2)
            foodChange2.setText(R.string.meatString6)
            val foodChange3 = findViewById<TextView>(R.id.food3)
            foodChange3.setText(R.string.meatString7)
            val foodChange4 = findViewById<TextView>(R.id.food4)
            foodChange4.setText(R.string.meatString9)

            val image1 = findViewById<ImageView>(R.id.imageView5)
            image1.setImageResource(R.drawable.diane)
            val image2 = findViewById<ImageView>(R.id.imageView6)
            image2.setImageResource(R.drawable.mushroomburger)
            val image3 = findViewById<ImageView>(R.id.imageView7)
            image3.setImageResource(R.drawable.meatloaf)
            val image4 = findViewById<ImageView>(R.id.imageView8)
            image4.setImageResource(R.drawable.ribs)
        }
//        if (count == 2 && foodSelection == "Red Meat"){
//            val foodChange1 = findViewById<TextView>(R.id.food1)
//            foodChange1.setText(R.string.meatString9)
//            val foodChange2 = findViewById<TextView>(R.id.food2)
//            foodChange2.setText(R.string.meatString10)
//            val foodChange3 = findViewById<TextView>(R.id.food3)
//            foodChange3.setText(R.string.meatString11)
//            val foodChange4 = findViewById<TextView>(R.id.food4)
//            foodChange4.setText(R.string.meatString12)
//
//            val image1 = findViewById<ImageView>(R.id.imageView5)
//            image1.setImageResource(R.drawable.ribs)
//            val image2 = findViewById<ImageView>(R.id.imageView6)
//            image2.setImageResource(R.drawable.mushroomburger)
//            val image3 = findViewById<ImageView>(R.id.imageView7)
//            image3.setImageResource(R.drawable.meatloaf)
//            val image4 = findViewById<ImageView>(R.id.imageView8)
//            image4.setImageResource(R.drawable.burger)
//        }
    }

//    fun incrementCount(view: View) {
//        count++
//
//        if (count == 3){
//            count = 0
//        }
//        count
//    }
//
//    fun updateUI(){
//        //TextView
//        saveText1 = foodChange1
//        //ImageView
//        messageTextView2.text = answerToMath
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        outState.putString("message", answerToMath)
//        outState.putString("message2", cool)
//        super.onSaveInstanceState(outState)
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        answerToMath = savedInstanceState.getString("message", "")
//        cool = savedInstanceState.getString("message2", "")
//        updateUI()
//
//    }


}