package com.example.kotlin_practice_team17_kiosk_2ver

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlin_practice_team17_kiosk.TimeChecker
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Burger
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Dessert
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Drink
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Menu
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Side
import kotlinx.coroutines.delay
import java.lang.NumberFormatException
import java.time.LocalDateTime
import java.util.Timer
import java.util.TimerTask

var burgerMenuList = mutableListOf<Burger>()
var drinkMenuList = mutableListOf<Drink>()
var sideMenuList = mutableListOf<Side>()
var dessertMenuList = mutableListOf<Dessert>()

var menuController = MenuController()
var menuPrinter = MenuPrinter()
var basketController = BasketController()
var basketAdder = BasketAdder()
var timeChecker = TimeChecker()

var menuList = mutableListOf<Menu>()

@RequiresApi(Build.VERSION_CODES.O)
suspend fun main() {
    Timer().scheduleAtFixedRate( object : TimerTask() {
        override fun run() {
            showMessagePerSecond()
        }
    }, 0, 10000)

    menuController.addBurgerMenu()
    menuController.addDrinkMenu()
    menuController.addSideMenu()
    menuController.addDessertMenu()

    while (true) {
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
                    delay(2000)
                }
                2 -> {
                    menuPrinter.printDrinkMenu()
                    var drinkMenuChoice = readLine()?.toInt()
                    if (drinkMenuChoice != null) {
                        basketController.drinkBasket(drinkMenuChoice)
                    }
                    delay(2000)
                }
                3 -> {
                    menuPrinter.printSideMenu()
                    var sideMenuChoice = readLine()?.toInt()
                    if (sideMenuChoice != null) {
                        basketController.sideBasket(sideMenuChoice)
                    }
                    delay(2000)
                }
                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()
                    if (dessertMenuChoice != null) {
                        basketController.dessertBasket(dessertMenuChoice)
                    }
                    delay(2000)
                }
                5 -> {
                    if(!timeChecker.checkTimeRage()) {
                        basketController.calculate()
                        System.exit(0)
                    }
                    else {
                        println("점검시간입니다. 결제를 할 수 없습니다.")
                    }
                }
                6 -> break
                else -> {println("올바른 번호를 입력하세요.")}
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요")
            delay(2000)
        }
    }
}
fun showMessagePerSecond() {
    println("----------현재 주문 대기 수 : ${menuList.size}----------")
}