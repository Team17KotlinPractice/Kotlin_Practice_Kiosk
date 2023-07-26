package com.example.kotlin_practice_team17_kiosk.side.drink

class Fanta : Drink() {
    override var name:String="환타"
    override var price:Int = 2000
    override var description:String = "환타 오렌지맛"

    override fun printDrink() {
        println("3. $name | ${price}won | $description")
    }
}