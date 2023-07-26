package com.example.kotlin_practice_team17_kiosk

import com.example.kotlin_practice_team17_kiosk.side.drink.Coke
import com.example.kotlin_practice_team17_kiosk.side.drink.Fanta
import com.example.kotlin_practice_team17_kiosk.side.drink.Sprite
import com.example.kotlin_practice_team17_kiosk.side.drink.ZeroCoke
import drinkList

class BasketController {
    fun addToBasketDrink(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    var newCoke = Coke()
                    drinkList.add(newCoke)
                }
                2 -> {
                    var newSprite = Sprite()
                    drinkList.add(newSprite)
                }
                3 -> {
                    var newFanta = Fanta()
                    drinkList.add(newFanta)
                }
                4 -> {
                    var newZeroCoke = ZeroCoke()
                    drinkList.add(newZeroCoke)
                }
            }
        }
        else if(purchaseOrNot == 2) {}
        else {println("올바른 번호를 입력하세요.")}
    }

}