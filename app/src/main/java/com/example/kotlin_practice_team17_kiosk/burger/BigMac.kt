package com.example.kotlin_practice_team17_kiosk.burger



class BigMac : Burger() {
    override var name:String = "빅맥"
    override var price:Int = 5200
    override var description:String = "빅맥 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}