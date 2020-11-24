package com.example.lab8

data class newDataClass(var name:String="", var url:String="") {
    fun findWebsite(position:Int){
        websiteName(position)
        websiteUrl(position)
    }

    private fun websiteName(position: Int){
        when(position){
            0 -> name = "Find Math Website"
            1 -> name = "Find Other Website"
            else -> name = "Other Website"
        }
    }

    private fun websiteUrl(position: Int){
        when(position){
            0 -> url = "https://www.coolmathgames.com/"
            1 -> url = "https://www.google.com/"
            else -> url = "https://pbskids.org/"
        }
    }
}



