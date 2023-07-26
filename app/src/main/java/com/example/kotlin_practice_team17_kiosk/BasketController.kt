package com.example.kotlin_practice_team17_kiosk

import com.example.kotlin_practice_team17_kiosk.dessert.ApplePie
import com.example.kotlin_practice_team17_kiosk.dessert.Chiller
import com.example.kotlin_practice_team17_kiosk.dessert.Coleslaw
import com.example.kotlin_practice_team17_kiosk.dessert.MacFlurry
import com.example.kotlin_practice_team17_kiosk.side.CheezeStick
import com.example.kotlin_practice_team17_kiosk.side.FrenchFries
import com.example.kotlin_practice_team17_kiosk.side.MacNugget
import com.example.kotlin_practice_team17_kiosk.side.MacWing
import com.example.kotlin_practice_team17_kiosk.side.drink.Coke
import com.example.kotlin_practice_team17_kiosk.side.drink.Fanta
import com.example.kotlin_practice_team17_kiosk.side.drink.Sprite
import com.example.kotlin_practice_team17_kiosk.side.drink.ZeroCoke
import orderList

class BasketController {
    fun addToBasketDrink(purchaseOrNot : Int, choice : Int) {
        val menu = Menu()
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    menu.drink = Coke()
                    orderList.add(menu)
                }
                2 -> {
                    menu.drink = Sprite()
                    orderList.add(menu)
                }
                3 -> {
                    menu.drink = Fanta()
                    orderList.add(menu)
                }
                4 -> {
                    menu.drink = ZeroCoke()
                    orderList.add(menu)
                }
            }
        }
        else if(purchaseOrNot == 2) {}
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketDessert(purchaseOrNot : Int, choice : Int) {
        val menu = Menu()
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    menu.dessert = ApplePie()
                    orderList.add(menu)
                }
                2 -> {
                    menu.dessert = Chiller()
                    orderList.add(menu)
                }
                3 -> {
                    menu.dessert = Coleslaw()
                    orderList.add(menu)
                }
                4 -> {
                    menu.dessert = MacFlurry()
                    orderList.add(menu)
                }
            }
        }
        else if(purchaseOrNot == 2) {}
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketSide(purchaseOrNot : Int, choice : Int) {
        val menu = Menu()
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    menu.side = CheezeStick()
                    orderList.add(menu)
                }
                2 -> {
                    menu.side = FrenchFries()
                    orderList.add(menu)
                }
                3 -> {
                    menu.side = MacNugget()
                    orderList.add(menu)
                }
                4 -> {
                    menu.side = MacWing()
                    orderList.add(menu)
                }
            }
        }
        else if(purchaseOrNot == 2) {}
        else {println("올바른 번호를 입력하세요.")}
    }

}