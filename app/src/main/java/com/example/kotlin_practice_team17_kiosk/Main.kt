
import com.example.kotlin_practice_team17_kiosk.BasketController
import com.example.kotlin_practice_team17_kiosk.Menu
import com.example.kotlin_practice_team17_kiosk.MenuPrinter

import java.lang.NumberFormatException

var menuList = mutableListOf<Menu>()
var menuPrinter = MenuPrinter()
var basketController = BasketController()
fun main() {
    while(true) {
        menuPrinter.printTotalMenu()
        try {
            var totalMenuChoice = readLine()?.toInt()
            when (totalMenuChoice) {

                1 -> {
                    menuPrinter.printBurgerMenu()
                    var drinkMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseOrNotBurger = readLine()?.toInt()
                    if (drinkMenuChoice != null && purchaseOrNotBurger !=null) {
                        basketController.addToBasketBurger(purchaseOrNotBurger,drinkMenuChoice)
                    }
                }
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
                    var purchaseOrNotSide = readLine()?.toInt()
                    if (sideMenuChoice != null && purchaseOrNotSide != null) {
                        basketController.addToBasketDrink(purchaseOrNotSide, sideMenuChoice)
                    }

                }
                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseOrNotDessert = readLine()?.toInt()
                    if (dessertMenuChoice != null && purchaseOrNotDessert != null) {
                        basketController.addToBasketDrink(purchaseOrNotDessert, dessertMenuChoice)
                    }
                }
                5 -> {
                    var price = 0
                    for(menu in menuList) {
                        price += menu.price
                    }
                    println("가격은 ${price}원 입니다.")
                    break
                }
                6 -> break
                else -> {
                    println("올바른 번호를 입력하세요.")
                }
            }
        }catch (e: NumberFormatException){
            println("숫자를 입력해주세요")
        }

    }
}