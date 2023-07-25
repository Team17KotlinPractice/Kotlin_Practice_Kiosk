package com.example.kotlin_practice_team17_kiosk.dessert

class MacFlurry : Dessert(){
    var name:String = "MacFlurry"
    var price:Int = 3000
    var description:String = "컵에 담은 소프트 아이크림에 각종 재료를 섞은 디저트"

    override fun printDessert() {
        println("4.${name} | ${price}₩ | ${description}")
    }
}