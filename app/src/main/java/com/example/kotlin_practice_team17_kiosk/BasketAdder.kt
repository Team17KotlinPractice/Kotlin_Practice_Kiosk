package com.example.kotlin_practice_team17_kiosk_2ver

import com.example.kotlin_practice_team17_kiosk_2ver.menu.Burger
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Dessert
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Drink
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Side

class BasketAdder {
    fun addToBasketBurger(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            for(burger in burgerMenuList) {
                if (choice == burger.num) {
                    menuList.add(burger)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketDrink(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            for(drink in drinkMenuList) {
                if(choice == drink.num) {
                    menuList.add(drink)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketSide(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            for(side in sideMenuList) {
                if(choice == side.num) {
                    menuList.add(side)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketDessert(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            for(dessert in dessertMenuList) {
                if(choice == dessert.num) {
                    menuList.add(dessert)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }
}