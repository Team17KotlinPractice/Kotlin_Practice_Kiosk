package com.example.kotlin_practice_team17_kiosk


import basketController
import com.example.kotlin_practice_team17_kiosk.burger.BigMac
import com.example.kotlin_practice_team17_kiosk.burger.DoubleQuaterPoundCheeze
import com.example.kotlin_practice_team17_kiosk.burger.MacCrispy
import com.example.kotlin_practice_team17_kiosk.burger.Shanghai
import com.example.kotlin_practice_team17_kiosk.dessert.ApplePie
import com.example.kotlin_practice_team17_kiosk.dessert.Chiller
import com.example.kotlin_practice_team17_kiosk.dessert.Coleslaw
import com.example.kotlin_practice_team17_kiosk.dessert.MacFlurry
import com.example.kotlin_practice_team17_kiosk.side.CheezeStick
import com.example.kotlin_practice_team17_kiosk.side.FrenchFries
import com.example.kotlin_practice_team17_kiosk.side.MacNugget
import com.example.kotlin_practice_team17_kiosk.side.MacWing
import com.example.kotlin_practice_team17_kiosk.side.drink.Coke
import com.example.kotlin_practice_team17_kiosk.side.drink.Drink
import com.example.kotlin_practice_team17_kiosk.side.drink.Fanta
import com.example.kotlin_practice_team17_kiosk.side.drink.Sprite
import com.example.kotlin_practice_team17_kiosk.side.drink.ZeroCoke
import kotlinx.coroutines.NonCancellable.start
import menuPrinter
import orderList
import java.lang.NumberFormatException

class MenuPrinter {

    fun printOrderMenu(){
        println("\n-----전체 메뉴를 출력합니다.-----")
        println("1. 버거")
        println("2. 음료")
        println("3. 사이드")
        println("4. 디저트")
        println("\n-----주문 메뉴 확인-----")
        println("5. 주문 | 장바구니 확인 후 주문")
        println("6. 취소 | 진행 중인 주문 취소 ")

        try {
            var orderOrCancel = readLine()?.toInt()
            when (orderOrCancel) {

                1 -> {}
                2 -> {
                    menuPrinter.printDrinkMenu()
                    var drinkMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseOrNotDrink = readLine()?.toInt()
                    if (purchaseOrNotDrink != null && drinkMenuChoice != null) {
                        basketController.addToBasketDrink(purchaseOrNotDrink, drinkMenuChoice)
                        printOrderMenu()
                    }
                }
                3 -> {
                    menuPrinter.printSideMenu()
                    var sideMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseSideChoice = readLine()?.toInt()
                    if (purchaseSideChoice != null && sideMenuChoice != null) {
                        basketController.addToBasketSide(purchaseSideChoice, sideMenuChoice)
                        menuPrinter.printOrderMenu()
                    }
                }
                4 -> {
                    menuPrinter.printDessertMenu()
                    var dessertMenuChoice = readLine()?.toInt()
                    menuPrinter.printPurchaseOrNot()
                    var purchaseOrNotDessert = readLine()?.toInt()
                    if (purchaseOrNotDessert != null && dessertMenuChoice != null) {
                        basketController.addToBasketDessert(purchaseOrNotDessert, dessertMenuChoice)
                        menuPrinter.printOrderMenu()
                    }
                }
                5 -> {
                    println("\n아래와 같이 주문하시겠습니까?")
                    menuPrinter.printOrderedMenu(orderList)

                    println("\n1. 주문      2. 메뉴판") //추후 구현
                    var finalOrder = readLine()?.toInt()
                    if (finalOrder == 1){
                        println("주문되었습니다.")
                    }else if(finalOrder == 2){
                        menuPrinter.printOrderMenu()
                    }
                }
                6 -> {
                    orderList.clear()
                    println("주문 취소") //추후 구현 : 맨 처음으로 돌아가기
                }
                else -> {
                    println("올바른 번호를 입력하세요.")
                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요")
        }
    }
    fun printTotalMenu() {
        println("-----전체 메뉴를 출력합니다.-----")
        println("1. 버거")
        println("2. 음료")
        println("3. 사이드")
        println("4. 디저트")
    }
    fun printDrinkMenu() {

        var coke = Coke()
        var fanta = Fanta()
        var sprite = Sprite()
        var zeroCoke = ZeroCoke()

        coke.printDrink()
        sprite.printDrink()
        fanta.printDrink()
        zeroCoke.printDrink()
        println("5. 뒤로가기")
    }

    fun printBurgerMenu() {

        var bigMac = BigMac()
        var doubleQuaterPoundCheeze = DoubleQuaterPoundCheeze()
        var macCrispy = MacCrispy()
        var shanghai = Shanghai()

        bigMac.printBurger()
        doubleQuaterPoundCheeze.printBurger()
        macCrispy.printBurger()
        shanghai.printBurger()
        println("5. 뒤로가기")
    }


    fun printSideMenu() {
        var cheezeStick = CheezeStick()
        var frenchFries = FrenchFries()
        var macNugget = MacNugget()
        var macWing = MacWing()

        cheezeStick.printMenu()
        frenchFries.printMenu()
        macNugget.printMenu()
        macWing.printMenu()
        println("5. 뒤로가기")
    }
    fun printDessertMenu() {
        var applePie = ApplePie()
        var chiller = Chiller()
        var coleslaw = Coleslaw()
        var macFlurry = MacFlurry()


        applePie.printDessert()
        chiller.printDessert()
        coleslaw.printDessert()
        macFlurry.printDessert()
        println("5. 뒤로가기")
    }

    fun printPurchaseOrNot() {
        println("\n해당 메뉴를 담으시겠습니까?")
        println("1. YES  |  2. NO")
    }

    fun printOrderedMenu(orderlist: MutableList<Menu>){
        var totalprice:Int = 0
        println("\n-----주문한 메뉴-----")
        for (order in orderlist){
            order.drink?.let {
                println("${it.name} | ${it.price} | ${it.description}")
                totalprice += it.price
            }
            order.dessert?.let {
                println("${it.name} | ${it.price} | ${it.description}")
                totalprice += it.price
            }
            order.side?.let {
                println("${it.name} | ${it.price} | ${it.description}")
                totalprice += it.price
            }
        }
        println("\n-----총 가격-----")
        println(totalprice)
    }

}