package com.example.kotlin_practice_team17_kiosk_2ver.menu

class Side(num : Int, name : String, price : Int, description : String) : Menu() {

    var num = 0
    var name = ""
    override var price = 0
    var description = ""

    init {
        this.num = num
        this.name = name
        this.price = price
        this.description = description
    }

    override fun printMenu() {
        println("${num}.$name | ${price}won | $description")
    }
}