package com.example.kotlin_practice_team17_kiosk.burger

class MacCrispy : Burger() {
    val name:String = "맥크리스피"
    val price:Int = 5900
    val description:String = "맥크리스피 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}