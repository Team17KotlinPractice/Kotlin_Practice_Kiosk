package com.example.kotlin_practice_team17_kiosk.dessert

class Coleslaw : Dessert(){
    override var name:String = "Coleslaw"
    override var price:Int = 2700
    override var description:String = "샐러드"

    override fun printDessert() {
        println("3.${name} | ${price}won | ${description}")
    }
}