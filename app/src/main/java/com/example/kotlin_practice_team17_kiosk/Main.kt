
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlin_practice_team17_kiosk.BasketController
import com.example.kotlin_practice_team17_kiosk.Menu.Menu
import com.example.kotlin_practice_team17_kiosk.MenuCotroller
import com.example.kotlin_practice_team17_kiosk.MenuPrinter

import java.lang.NumberFormatException

var orderList = mutableListOf<Menu>()
var menuPrinter = MenuPrinter()
var menuController = MenuCotroller()
var basketController = BasketController()
@RequiresApi(Build.VERSION_CODES.O)
suspend fun main() {

    println("안녕하세요! 맥도날드 입니다.")

    var customer= menuController.customerinput()

    while(true) {
        println()
        menuPrinter.printTotalMenu()
        try {
            var totalMenuChoice = readLine()?.toInt()
            when (totalMenuChoice) {

                1 -> {
                    menuPrinter.printBurgerMenu()
                    var burgerMenuChoice = readLine()?.toInt()

                    if (burgerMenuChoice == 5) {
                        continue
                    } else if (burgerMenuChoice!! < 5) {
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotBurger = readLine()?.toInt()
                        if (purchaseOrNotBurger != null && burgerMenuChoice != null) {
                            basketController.addToBasketBurger(purchaseOrNotBurger, burgerMenuChoice)
                            menuController.printOrderMenu(customer)
                            break
                        }
                    }else{
                        println("잘 못 입력하셨습니다.")
                    }
                }
                2 -> {
                    menuPrinter.printDrinkMenu()
                    var drinkMenuChoice = readLine()?.toInt()

                    if (drinkMenuChoice == 5) {
                        continue
                    } else if (drinkMenuChoice!! < 5) {
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotDrink = readLine()?.toInt()
                        if (purchaseOrNotDrink != null && drinkMenuChoice != null) {
                            basketController.addToBasketDrink(purchaseOrNotDrink, drinkMenuChoice)
                            menuController.printOrderMenu(customer)
                            break
                        }
                    }else{
                        println("잘 못 입력하셨습니다.")
                    }
                }

                3 -> {
                    menuPrinter.printSideMenu()
                    var sideMenuChoice = readLine()?.toInt()

                    if (sideMenuChoice == 5) {
                        continue
                    } else if (sideMenuChoice!! < 5) {
                        menuPrinter.printPurchaseOrNot()
                        var purchaseSideChoice = readLine()?.toInt()
                        if (purchaseSideChoice != null && sideMenuChoice != null) {
                            basketController.addToBasketSide(purchaseSideChoice, sideMenuChoice)
                            menuController.printOrderMenu(customer)
                            break
                        }
                    }else{
                        println("잘 못 입력하셨습니다.")
                    }
                }

                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()

                    if (dessertMenuChoice == 5) {
                        continue
                    } else if (dessertMenuChoice!! < 5) {
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotDessert = readLine()?.toInt()
                        if (purchaseOrNotDessert != null && dessertMenuChoice != null) {
                            basketController.addToBasketDessert(purchaseOrNotDessert, dessertMenuChoice)
                            menuController.printOrderMenu(customer)
                            break
                        }
                    }else{
                        println("잘 못 입력하셨습니다.")
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



