package com.example.kotlin_practice_team17_kiosk.burger

class MacCrispy : Burger() {
    override var name:String = "맥크리스피"
    override var price:Int = 5900
    override var description:String = "맥크리스피 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}