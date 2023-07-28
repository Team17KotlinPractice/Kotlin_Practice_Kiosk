package com.example.kotlin_practice_team17_kiosk

import android.os.Build
import androidx.annotation.RequiresApi
import basketController
import com.example.kotlin_practice_team17_kiosk.Customer.Customer
import com.example.kotlin_practice_team17_kiosk.Menu.Menu
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import menuController
import menuPrinter
import orderList
import java.lang.Exception
import java.lang.NumberFormatException
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread


class MenuCotroller {
    var totalprice:Int = 0

    @RequiresApi(Build.VERSION_CODES.O)
    suspend fun printOrderMenu(customer: Customer){
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

                1 -> {
                    menuPrinter.printBurgerMenu()
                    var burgerMenuChoice = readLine()?.toInt()
                    if (burgerMenuChoice == 5) {
                        printOrderMenu(customer)
                    } else if (burgerMenuChoice!! < 5) {
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotBurger = readLine()?.toInt()
                        if (purchaseOrNotBurger != null && burgerMenuChoice != null) {
                            basketController.addToBasketBurger(purchaseOrNotBurger, burgerMenuChoice)
                            menuController.printOrderMenu(customer)
                        }
                    }else{
                        println("잘 못 입력하셨습니다.")
                        printOrderMenu(customer)
                    }
                }
                2 -> {
                    menuPrinter.printDrinkMenu()
                    var drinkMenuChoice = readLine()?.toInt()
                    if (drinkMenuChoice != 5){ //예외 처리 6 입력했을 때
                        menuPrinter.printPurchaseOrNot()
                        var purchaseOrNotDrink = readLine()?.toInt()
                        if (purchaseOrNotDrink != null && drinkMenuChoice != null) {
                            basketController.addToBasketDrink(purchaseOrNotDrink, drinkMenuChoice)
                            printOrderMenu(customer)
                        }
                    }else{
                        printOrderMenu(customer)
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
                            printOrderMenu(customer)
                        }
                    }else{
                        printOrderMenu(customer)
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
                            printOrderMenu(customer)
                        }
                    }else{
                        printOrderMenu(customer)
                    }
                }
                5 -> {
                    orderBasket(customer)
                }
                6 -> {
                    orderList.clear()
                    println("주문 취소")
                }
                else -> {
                    println("올바른 번호를 입력하세요.")
                }
            }
        } catch (e: NumberFormatException) {
            println("숫자를 입력해주세요")
        }
    }

    fun customerinput() : Customer {
        println("\n고객 이름을 입력해주세요.")
        var cName = readLine().toString()
        var cMoney:Int = 0
        println("돈을 입력해주세요.")
        while(true){
            try{
                cMoney = Integer.parseInt(readLine())
                return Customer(cName, cMoney)
            }catch (e: Exception){
                println("숫자를 입력해주세요.")
            }
        }
    }

    fun printOrderedMenu(orderlist: MutableList<Menu>){
        totalprice = 0
        println("\n-----주문한 메뉴-----")
        for (order in orderlist){
            println("${order.name} | ${order.price} | ${order.description}")
            totalprice += order.price
        }
        println("\n-----총 가격-----")
        println(totalprice)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    suspend fun orderBasket(customer: Customer){
        println ("\n아래와 같이 주문하시겠습니까?")
        printOrderedMenu (orderList)

        println ("\n1. 주문      2. 메뉴판") //추후 구현
        var finalOrder = readLine()?.toInt()

        if (finalOrder == 1){

            val todayTime = LocalTime.now()
            val timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss")

            var startTime = LocalTime.of(11, 0)
            var endTime = LocalTime.of(15, 34)

            var isTime = startTime > todayTime || endTime < todayTime

            if (isTime == false){
                println("현재 시각은 ${todayTime.format(timeFormat)}입니다.")
                println("은행 점검 시간은 ${startTime} ~ ${endTime} 이므로 결제할 수 없습니다.")

                runBlocking {
                    launch {
                        delay(3000)
                    }
                }
                orderBasket(customer)

            }else{
                if (customer.money >= totalprice){
                    customer.money = customer.money - totalprice
                    println("주문되었습니다.")
                    println("현재 잔액 : ${customer.money}원")
                    orderList.clear()
                }else{
                    println("죄송합니다. 돈이 부족합니다.")
                }
            }

        }else if(finalOrder == 2){
            menuController.printOrderMenu(customer)
        }
    }


}