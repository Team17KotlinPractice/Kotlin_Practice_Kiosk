package com.example.kotlin_practice_team17_kiosk.burger

class Shanghai : Burger() {
    override var name:String = "상하이"
    override var price:Int = 5200
    override var description:String = "맥 스파이시 상하이 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}