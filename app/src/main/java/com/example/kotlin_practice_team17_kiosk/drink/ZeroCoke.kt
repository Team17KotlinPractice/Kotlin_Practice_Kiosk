package com.example.kotlin_practice_team17_kiosk.side.drink

class ZeroCoke: Drink() {
    val name:String="제로콜라"
    val price:Int = 2000
    val description:String = "코카콜라 제로"

    override fun printDrink() {
        println("4. $name | ${price}won | $description")
    }
}