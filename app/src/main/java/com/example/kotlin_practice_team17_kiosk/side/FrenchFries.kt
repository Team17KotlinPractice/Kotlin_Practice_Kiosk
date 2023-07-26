package com.example.kotlin_practice_team17_kiosk.side

class FrenchFries : Side() {
    override var name = "감자튀김"
    override var price = 2800
    override var description = "후렌치 후라이/324kcal"
    override fun printMenu() {
        println("2. $name | ${price}won | $description")
    }
}