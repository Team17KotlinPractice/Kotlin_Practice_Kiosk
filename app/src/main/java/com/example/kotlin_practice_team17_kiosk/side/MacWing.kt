package com.example.kotlin_practice_team17_kiosk.side

class MacWing : Side() {
    override var name = "맥윙"
    override var price = 4000
    override var description = "245kcal / 2조각"
    override fun printMenu() {
        println("4. $name | ${price}won | $description")
    }
}