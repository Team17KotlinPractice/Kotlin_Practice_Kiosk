package com.example.kotlin_practice_team17_kiosk.side.drink

class Coke :Drink() {
    val name:String = "콜라"
    val price:Int = 2000
    val description:String = "코카콜라"

    override fun printDrink() {
        println("1. $name | ${price}won | $description")
    }

}