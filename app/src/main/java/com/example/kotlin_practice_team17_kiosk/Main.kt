package com.example.kotlin_practice_team17_kiosk



import java.lang.NumberFormatException

var menuPrinter = MenuPrinter()
fun main() {
    while(true) {
        menuPrinter.printTotalMenu()
        try {  var totalMenuChoice = readLine()?.toInt()
            when (totalMenuChoice) {
                1 -> menuPrinter.printBurgerMenu()
                2 -> menuPrinter.printDrinkMenu()
                3 -> {}
                4 -> {}
                5 -> break
                else -> {
                    println("올바른 번호를 입력하세요")
                }
            }

        }catch (e: NumberFormatException){
            println("숫자를 입력해주세요")
        }

    }
}