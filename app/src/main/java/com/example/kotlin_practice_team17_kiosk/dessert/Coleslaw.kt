package com.example.kotlin_practice_team17_kiosk.dessert

class Coleslaw : Dessert(){
    var name:String = "Coleslaw"
    var price:Int = 2700
    var description:String = "샐러드"

    override fun printDessert() {
        println("3.${name} | ${price}₩ | ${description}")
    }
}