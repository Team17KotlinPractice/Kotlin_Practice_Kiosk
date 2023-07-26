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

class MenuPrinter {
    fun printTotalMenu() {
        println("-----전체 메뉴를 출력합니다.-----")
        println("1. 버거")
        println("2. 음료")
        println("3. 사이드")
        println("4. 디저트")
        println("5. 종료")
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
        println("해당 메뉴를 담으시겠습니까?")
        println("1. YES  |  2. NO")
    }

}