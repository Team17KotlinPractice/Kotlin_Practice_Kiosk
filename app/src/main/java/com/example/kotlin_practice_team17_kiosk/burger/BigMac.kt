package com.example.kotlin_practice_team17_kiosk.burger



class BigMac : Burger() {
    val name:String = "빅맥"
    val price:Int = 5200
    val description:String = "빅맥 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}