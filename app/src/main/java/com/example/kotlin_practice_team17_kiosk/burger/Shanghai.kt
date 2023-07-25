package com.example.kotlin_practice_team17_kiosk.burger

class Shanghai : Burger() {
    val name:String = "상하이"
    val price:Int = 5200
    val description:String = "맥 스파이시 상하이 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}