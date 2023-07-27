package com.example.kotlin_practice_team17_kiosk_2ver

class MenuPrinter {

    fun printTotalMenu() {
        println("-----전체 메뉴를 출력합니다.-----")
        println("1. 버거")
        println("2. 음료")
        println("3. 사이드")
        println("4. 디저트")
        println("5. 장바구니 계산")
        println("6. 종료")
    }

    fun printBurgerMenu() {
        for(burger in burgerMenuList ) {
            burger.printMenu()
        }
    }

    fun printDrinkMenu() {
        for(drink in drinkMenuList) {
            drink.printMenu()
        }
    }

    fun printSideMenu() {
        for(side in sideMenuList) {
            side.printMenu()
        }
    }

    fun printDessertMenu() {
        for(dessert in dessertMenuList) {
            dessert.printMenu()
        }
    }

    fun printPurchaseOrNot() {
        println("해당 메뉴를 담으시겠습니까?")
        println("1. YES  |  2. NO")
    }
}