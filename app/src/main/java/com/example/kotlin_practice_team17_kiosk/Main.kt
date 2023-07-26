
import com.example.kotlin_practice_team17_kiosk.BasketController
import com.example.kotlin_practice_team17_kiosk.Menu
import com.example.kotlin_practice_team17_kiosk.MenuPrinter
import com.example.kotlin_practice_team17_kiosk.dessert.Dessert
import com.example.kotlin_practice_team17_kiosk.side.drink.Drink
import java.lang.Exception

import java.lang.NumberFormatException

var orderList = mutableListOf<Menu>()
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
                    if (drinkMenuChoice != 5){ //예외 처리 6 입력했을 때
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotDrink = readLine()?.toInt()
                        if (purchaseOrNotDrink != null && drinkMenuChoice != null) {
                            basketController.addToBasketDrink(purchaseOrNotDrink, drinkMenuChoice)
                            menuPrinter.printOrderMenu()
                            break
                        }
                    }else{
                        continue
                    }
                }

                3 -> {
                    menuPrinter.printSideMenu()
                    var sideMenuChoice = readLine()?.toInt()
                    if (sideMenuChoice != 5){ //예외 처리 6 입력했을 때
                        menuPrinter.printPurchaseOrNot()
                        var purchaseSideChoice = readLine()?.toInt()
                        if (purchaseSideChoice != null && sideMenuChoice != null) {
                            basketController.addToBasketSide(purchaseSideChoice, sideMenuChoice)
                            menuPrinter.printOrderMenu()
                            break
                        }
                    }else{
                        continue
                    }
                }

                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()
                    if (dessertMenuChoice != 5){ //예외 처리 6 입력했을 때
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotDessert = readLine()?.toInt()
                        if (purchaseOrNotDessert != null && dessertMenuChoice != null) {
                            basketController.addToBasketDessert(purchaseOrNotDessert, dessertMenuChoice)
                            menuPrinter.printOrderMenu()
                            break
                        }
                    }else{
                        continue
                    }
                }
                else -> {
                    println("올바른 번호를 입력하세요.")
                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요")
        }
    }
}

