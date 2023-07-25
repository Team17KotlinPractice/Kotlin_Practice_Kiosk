package com.example.kotlin_practice_team17_kiosk.side

class CheezeStick : Side() {
    override var name = "치즈스틱"
    override var price = 3300
    override var description = "골든 모짜렐라 치즈스틱"

    override fun printMenu() {
        println("1. $name | ${price}won | $description")
    }

}