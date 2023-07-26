
import com.example.kotlin_practice_team17_kiosk.BasketController
import com.example.kotlin_practice_team17_kiosk.MenuPrinter
import com.example.kotlin_practice_team17_kiosk.dessert.Dessert
import com.example.kotlin_practice_team17_kiosk.side.drink.Drink

import java.lang.NumberFormatException

var drinkList = mutableListOf<Drink>()
var menuPrinter = MenuPrinter()
var basketController = BasketController()
fun main() {
    while(true) {
        menuPrinter.printTotalMenu()
        try {
            var totalMenuChoice = readLine()?.toInt()
            when (totalMenuChoice) {

                1 -> {}
                2 -> {
                    menuPrinter.printDrinkMenu()
                    var drinkMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseOrNotDrink = readLine()?.toInt()
                    if (purchaseOrNotDrink != null && drinkMenuChoice != null) {
                        basketController.addToBasketDrink(purchaseOrNotDrink, drinkMenuChoice)
                    }
                }
                3 -> {
                    menuPrinter.printSideMenu()
                    var sideMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseSideChoice = readLine()?.toInt()
                    if(purchaseSideChoice == 1) {
                    }
                }
                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseDessertChoice = readLine()?.toInt()
                    if(purchaseDessertChoice == 1) {
                    }
                }
                5 -> break
                6 ->
                    for (drink in drinkList) {
                        println(drink.printDrink())
                    }
                else -> {
                    println("올바른 번호를 입력하세요.")
                }
            }
        }catch (e: NumberFormatException){
            println("숫자를 입력해주세요")
        }

    }
}