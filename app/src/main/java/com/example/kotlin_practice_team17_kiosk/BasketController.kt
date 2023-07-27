package com.example.kotlin_practice_team17_kiosk_2ver

import com.example.kotlin_practice_team17_kiosk.Customer

class BasketController {
    fun burgerBasket(burgerMenuChoice : Int) {
        when(burgerMenuChoice) {
            in 1..4 -> {
                menuPrinter.printPurchaseOrNot()
                var purchaseOrNotBurger = readLine()?.toInt()
                if (purchaseOrNotBurger !=null) {
                    basketAdder.addToBasketBurger(purchaseOrNotBurger,burgerMenuChoice)
                }
            }
            5 -> {}
            else -> {println("올바른 메뉴 번호를 입력하세요.")}
        }
    }

    fun drinkBasket(drinkMenuChoice : Int) {
        when(drinkMenuChoice) {
            in 1..4 -> {
                menuPrinter.printPurchaseOrNot()
                var purchaseOrNotDrink = readLine()?.toInt()
                if (purchaseOrNotDrink != null) {
                    basketAdder.addToBasketDrink(purchaseOrNotDrink, drinkMenuChoice)
                }
            }
            5 -> {}
            else -> { println("올바른 메뉴 번호를 입력하세요.")}
        }
    }

    fun sideBasket(sideMenuChoice : Int) {
        when(sideMenuChoice) {
            in 1..4 -> {
                menuPrinter.printPurchaseOrNot()
                var purchaseOrNotSide = readLine()?.toInt()
                if (purchaseOrNotSide != null) {
                    basketAdder.addToBasketSide(purchaseOrNotSide, sideMenuChoice)
                }
            }
            5 -> {}
            else -> { println("올바른 메뉴 번호를 입력하세요.") }
        }
    }

    fun dessertBasket(dessertMenuChoice: Int) {
        when(dessertMenuChoice) {
            in 1..4 -> {
                menuPrinter.printPurchaseOrNot()
                var purchaseOrNotDessert = readLine()?.toInt()
                if (purchaseOrNotDessert != null) {
                    basketAdder.addToBasketDessert(purchaseOrNotDessert, dessertMenuChoice)
                }
            }
            5 -> {}
            else -> { println("올바른 메뉴 번호를 입력하세요.") }
        }
    }

    fun calculate() {
        var price = 0
        for(menu in menuList) {
            price += menu.price
        }
        var customer = Customer()
        println("가격은 ${price}원 입니다.")
        println("현재 보유 금액은 ${customer.money}입니다.")
        if(price == 0) { println("장바구니에 상품이 없습니다.") }
        else {
            if (price > customer.money) {
                println("계산을 할 수 없습니다.")
            } else {
                println("계산이 완료되었습니다.")
                println("남은 금액은 ${customer.money - price}입니다.")
            }
        }
    }
}