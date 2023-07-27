package com.example.kotlin_practice_team17_kiosk_2ver

import com.example.kotlin_practice_team17_kiosk_2ver.menu.Burger
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Dessert
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Drink
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Menu
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Side
import java.lang.NumberFormatException

var burgerMenuList = mutableListOf<Burger>()
var drinkMenuList = mutableListOf<Drink>()
var sideMenuList = mutableListOf<Side>()
var dessertMenuList = mutableListOf<Dessert>()

var menuController = MenuController()
var menuPrinter = MenuPrinter()
var basketController = BasketController()
var basketAdder = BasketAdder()

var menuList = mutableListOf<Menu>()

fun main() {
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
                else -> {println("올바른 번호를 입력하세요.")}
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요")
        }
    }
}