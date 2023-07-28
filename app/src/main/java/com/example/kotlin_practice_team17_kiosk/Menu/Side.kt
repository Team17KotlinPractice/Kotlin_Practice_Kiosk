package com.example.kotlin_practice_team17_kiosk.Menu

import com.example.kotlin_practice_team17_kiosk.Menu.Menu

class Side(_num:Int, _name:String, _price:Int, _description:String) : Menu() {

    var num : Int = _num
    override var name: String = _name
    override var price: Int = _price
    override var description: String = _description

    override fun printMenu() {
        println("${num}. ${name} | ${price}won | ${description}")
    }

}