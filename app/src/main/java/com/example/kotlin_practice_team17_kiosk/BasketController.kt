package com.example.kotlin_practice_team17_kiosk

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
import com.example.kotlin_practice_team17_kiosk.side.drink.Fanta
import com.example.kotlin_practice_team17_kiosk.side.drink.Sprite
import com.example.kotlin_practice_team17_kiosk.side.drink.ZeroCoke
import menuList

class BasketController {
    fun addToBasketDrink(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    var newCoke = Coke()
                    menuList.add(newCoke)
                }
                2 -> {
                    var newSprite = Sprite()
                    menuList.add(newSprite)
                }
                3 -> {
                    var newFanta = Fanta()
                    menuList.add(newFanta)
                }
                4 -> {
                    var newZeroCoke = ZeroCoke()
                    menuList.add(newZeroCoke)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }
    fun addToBasketBurger(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    var newBigMac = BigMac()
                    menuList.add(newBigMac)
                }
                2 -> {
                    var newDoubleQuater = DoubleQuaterPoundCheeze()
                    menuList.add(newDoubleQuater)
                }
                3 -> {
                    var newMacCrispy = MacCrispy()
                    menuList.add(newMacCrispy)
                }
                4 -> {
                    var newShanghai = Shanghai()
                    menuList.add(newShanghai)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }
    fun addToBasketSide(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    var newCheezeStick = CheezeStick()
                    menuList.add(newCheezeStick)
                }
                2 -> {
                    var newFrenchFries = FrenchFries()
                    menuList.add(newFrenchFries)
                }
                3 -> {
                    var newMacNugger = MacNugget()
                    menuList.add(newMacNugger)
                }
                4 -> {
                    var newMacWing = MacWing()
                    menuList.add(newMacWing)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }
    fun addToBasketDessert(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    var newApplePie = ApplePie()
                    menuList.add(newApplePie)
                }
                2 -> {
                    var newChiller = Chiller()
                    menuList.add(newChiller)
                }
                3 -> {
                    var newColeslaw = Coleslaw()
                    menuList.add(newColeslaw)
                }
                4 -> {
                    var newMacFlurry = MacFlurry()
                    menuList.add(newMacFlurry)
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }

}