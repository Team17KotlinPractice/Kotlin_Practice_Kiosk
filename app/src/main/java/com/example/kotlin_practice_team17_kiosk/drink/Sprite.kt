package com.example.kotlin_practice_team17_kiosk.side.drink

class Sprite : Drink(){
    val name:String = "사이다"
    val price:Int = 2000
    val description:String = "스프라이트"

    override fun printDrink() {
        println("2. $name | ${price}won | $description")
    }
}