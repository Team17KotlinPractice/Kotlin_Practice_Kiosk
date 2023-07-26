package com.example.kotlin_practice_team17_kiosk.side.drink

class Sprite : Drink(){
    override var name:String = "사이다"
    override var price:Int = 2000
    override var description:String = "스프라이트"

    override fun printDrink() {
        println("2. $name | ${price}won | $description")
    }
}