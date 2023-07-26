package com.example.kotlin_practice_team17_kiosk.dessert

class Chiller : Dessert(){
    override var name:String = "Chiller"
    override var price:Int = 2700
    override var description:String = "과즙과 얼음을 갈아 넣은 과일맛 아이스 음료"

    override fun printDessert() {
        println("2.${name} | ${price}won | ${description}")
    }
}