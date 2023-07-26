package com.example.kotlin_practice_team17_kiosk.burger

class DoubleQuaterPoundCheeze : Burger() {
    override var name:String = "더블 쿼터 파운드 치즈"
    override var price:Int = 7600
    override var description:String = "더블 쿼터 파운드 치즈 버거"

    override fun printBurger() {
        println("2. $name | ${price}won | $description")
    }

}