package com.example.kotlin_practice_team17_kiosk.side

class MacNugget : Side() {
    override var name = "맥너겟"
    override var price = 3300
    override var description = "163kcal/4조각"

    override fun printMenu() {
        println("3. $name | ${price}won | $description")
    }
}