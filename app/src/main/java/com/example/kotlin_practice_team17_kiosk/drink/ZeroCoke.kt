package com.example.kotlin_practice_team17_kiosk.side.drink

class ZeroCoke: Drink() {
    override var name:String="제로콜라"
    override var price:Int = 2000
    override var description:String = "코카콜라 제로"

    override fun printDrink() {
        println("4. $name | ${price}won | $description")
    }
}