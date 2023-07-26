
import com.example.kotlin_practice_team17_kiosk.AddToBasket
import com.example.kotlin_practice_team17_kiosk.BasketController
import com.example.kotlin_practice_team17_kiosk.Menu
import com.example.kotlin_practice_team17_kiosk.MenuPrinter

import java.lang.NumberFormatException

var menuList = mutableListOf<Menu>()
var menuPrinter = MenuPrinter()
var addToBasket = AddToBasket()
var basketController = BasketController()
fun main() {
    while(true) {
        menuPrinter.printTotalMenu()
        try {
            var totalMenuChoice = readLine()?.toInt()
            when (totalMenuChoice) {
                1 -> {
                    menuPrinter.printBurgerMenu()
                    var burgerMenuChoice = readLine()?.toInt()
                    if (burgerMenuChoice != null) {
                        basketController.burgerBasket(burgerMenuChoice)
                    }
                }
                2 -> {
                    menuPrinter.printDrinkMenu()
                    var drinkMenuChoice = readLine()?.toInt()
                    if (drinkMenuChoice != null) {
                        basketController.drinkBasket(drinkMenuChoice)
                    }
                }
                3 -> {
                    menuPrinter.printSideMenu()
                    var sideMenuChoice = readLine()?.toInt()
                    if (sideMenuChoice != null) {
                        basketController.sideBasket(sideMenuChoice)
                    }
                }
                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()
                    if (dessertMenuChoice != null) {
                        basketController.dessertBasket(dessertMenuChoice)
                    }
                }
                5 -> {
                    basketController.calculate()
                    break
                }
                6 -> break
                else -> { println("올바른 번호를 입력하세요.") }
            }
        }catch (e: NumberFormatException){
            println("숫자를 입력해주세요")
        }
    }
}