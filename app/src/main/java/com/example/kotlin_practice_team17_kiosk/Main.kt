import com.example.kotlin_practice_team17_kiosk.MenuPrinter

import java.lang.NumberFormatException

var menuPrinter = MenuPrinter()
fun main() {
    while(true) {
        menuPrinter.printTotalMenu()
        try {  var totalMenuChoice = readLine()?.toInt()
            when (totalMenuChoice) {

                1 -> {}
                2 -> {
                    menuPrinter.printDrinkMenu()
                }
                3 -> menuPrinter.printSideMenu()
                4 -> menuPrinter.printDessertMenu()
                5 -> break
                else -> {
                    println("올바른 번호를 입력하세요.")
                }
            }
        }catch (e: NumberFormatException){
            println("숫자를 입력해주세요")
        }

    }
}