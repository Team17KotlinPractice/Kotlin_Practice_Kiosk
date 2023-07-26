package com.example.kotlin_practice_team17_kiosk.dessert

class ApplePie : Dessert(){
    var name:String = "ApplePie"
    var price:Int = 1300
    var description:String = "사과를 넣어 구운 파이"

    override fun printDessert() {
        println("1.${name} | ${price}₩ | ${description}")
    }
}