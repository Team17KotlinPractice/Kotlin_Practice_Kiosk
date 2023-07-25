package com.example.kotlin_practice_team17_kiosk.side.drink

class Fanta : Drink() {
    val name:String="환타"
    val price:Int = 2000
    val description:String = "환타 오렌지맛"

    override fun prDrink() {
        println("3. $name | ${price}won | $description")
    }
}