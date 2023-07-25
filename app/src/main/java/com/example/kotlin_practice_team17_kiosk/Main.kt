package com.example.kotlin_practice_team17_kiosk

var menuPrinter = MenuPrinter()
fun main() {
    while(true) {
        menuPrinter.printTotalMenu()
        var totalMenuChoice = readLine()?.toInt()
        when (totalMenuChoice) {
            1 -> {}
            2 -> menuPrinter.printDrinkMenu()
            3 -> menuPrinter.printSideMenu()
            4 -> {}
            5 -> break
            else -> {
                println("올바른 번호를 입력하세요.")
            }
        }
    }
}