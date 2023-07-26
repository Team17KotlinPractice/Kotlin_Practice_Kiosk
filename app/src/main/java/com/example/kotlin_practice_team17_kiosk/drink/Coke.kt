package com.example.kotlin_practice_team17_kiosk.side.drink

class Coke :Drink() {
    override var name = "콜라"
    override var price:Int = 2000
    override var description:String = "코카콜라"

    override fun printDrink() {
        println("1. $name | ${price}won | $description")
    }

}