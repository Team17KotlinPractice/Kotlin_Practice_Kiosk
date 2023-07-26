package com.example.kotlin_practice_team17_kiosk.burger

class DoubleQuaterPoundCheeze : Burger() {
    val name:String = "더블 쿼터 파운드 치즈"
    val price:Int = 7600
    val description:String = "더블 쿼터 파운드 치즈 버거"

    override fun printBurger() {
        println("1. $name | ${price}won | $description")
    }

}