package com.example.kotlin_practice_team17_kiosk


import basketController
import com.example.kotlin_practice_team17_kiosk.Menu.Burger
import com.example.kotlin_practice_team17_kiosk.Menu.Menu
import com.example.kotlin_practice_team17_kiosk.Menu.Dessert
import com.example.kotlin_practice_team17_kiosk.Menu.Drink
import com.example.kotlin_practice_team17_kiosk.Menu.Side
import menuPrinter
import orderList
import java.lang.NumberFormatException

class MenuPrinter {

    fun printTotalMenu() {
        println("-----전체 메뉴를 출력합니다.-----")
        println("1. 버거")
        println("2. 음료")
        println("3. 사이드")
        println("4. 디저트")
    }

    fun printPurchaseOrNot() {
        println("\n해당 메뉴를 담으시겠습니까?")
        println("1. YES  |  2. NO")
    }

    fun printBurgerMenu() {

        var bigMac = Burger(1,"BigMac", 5200, "빅맥 버거")
        var doubleQuaterPoundCheeze = Burger(2,"DoubleQuaterPoundCheeze", 7600, "더블 쿼터 파운드 치즈 버거")
        var macCrispy = Burger(3,"MacCrispy", 5900, "맥크리스피 버거")
        var shanghai = Burger(4,"Shanghai", 5200, "맥 스파이시 상하이 버거")

        bigMac.printMenu()
        doubleQuaterPoundCheeze.printMenu()
        macCrispy.printMenu()
        shanghai.printMenu()
        println("5. 뒤로가기")
    }
    fun printDrinkMenu() {

        var coke = Drink(1,"Coke", 2000, "코카콜라")
        var fanta = Drink(2, "Fanta", 2000, "환타")
        var sprite = Drink(3, "Sprite", 2000, "스프라이트")
        var zeroCoke = Drink(4, "zeroCoke", 2000, "제로콜라")

        coke.printMenu()
        fanta.printMenu()
        sprite.printMenu()
        zeroCoke.printMenu()
        println("5. 뒤로가기")
    }

    fun printSideMenu() {
        var cheezeStick = Side(1, "CheezeStick", 3300, "골든 모짜렐라 치즈스틱 / 150kcal")
        var frenchFries = Side(2, "FrenchFries", 2800, "후렌치 후라이/324kcal")
        var macNugget = Side(3, "MacNugget", 3300, "163kcal/4조각")
        var macWing = Side(4, "MacWing", 4000, "245kcal / 2조각")

        cheezeStick.printMenu()
        frenchFries.printMenu()
        macNugget.printMenu()
        macWing.printMenu()
        println("5. 뒤로가기")
    }
    fun printDessertMenu() {
        var applePie = Dessert(1, "ApplePie", 1300, "사과 파이")
        var chiller = Dessert(2, "Chiller", 2700, "과일맛 아이스 음료")
        var coleslaw = Dessert(3, "Coleslaw", 2700, "샐러드")
        var macFlurry = Dessert(4, "MacFlurry", 3000, "아이스크림")

        applePie.printMenu()
        chiller.printMenu()
        coleslaw.printMenu()
        macFlurry.printMenu()
        println("5. 뒤로가기")
    }

}