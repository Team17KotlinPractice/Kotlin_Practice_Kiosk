package com.example.kotlin_practice_team17_kiosk

import com.example.kotlin_practice_team17_kiosk.Menu.Burger
import com.example.kotlin_practice_team17_kiosk.Menu.Dessert
import com.example.kotlin_practice_team17_kiosk.Menu.Drink
import com.example.kotlin_practice_team17_kiosk.Menu.Menu
import com.example.kotlin_practice_team17_kiosk.Menu.Side
import orderList

class BasketController {
    fun addToBasketBurger(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    orderList.add(Burger(1,"BigMac", 5200, "빅맥 버거"))
                }
                2 -> {
                    orderList.add(Burger(2,"DoubleQuaterPoundCheeze", 7600, "더블 쿼터 파운드 치즈 버거"))
                }
                3 -> {
                    orderList.add(Burger(3,"MacCrispy", 5900, "맥크리스피 버거"))
                }
                4 -> {
                    orderList.add(Burger(4,"Shanghai", 5200, "맥 스파이시 상하이 버거"))
                }
            }
            println("장바구니에 추가되었습니다.")
        }
        else if(purchaseOrNot == 2) {println("취소되었습니다.")}
        else {println("올바른 번호를 입력하세요.")}
    }
    fun addToBasketDrink(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    orderList.add(Drink(1, "Coke", 2000, "코카콜라"))
                }
                2 -> {
                    orderList.add(Drink(2, "Fanta", 2000, "환타"))
                }
                3 -> {
                    orderList.add(Drink(3, "Sprite", 2000, "스프라이트"))
                }
                4 -> {
                    orderList.add(Drink(4, "zeroCoke", 2000, "제로콜라"))
                }
            }
            println("장바구니에 추가되었습니다.")
        }
        else if(purchaseOrNot == 2) {println("취소되었습니다.")}
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketSide(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    orderList.add(Side(1, "CheezeStick", 3300, "골든 모짜렐라 치즈스틱 / 150kcal"))
                }
                2 -> {
                    orderList.add(Side(2, "FrenchFries", 2800, "후렌치 후라이/324kcal"))
                }
                3 -> {
                    orderList.add(Side(3, "MacNugget", 3300, "163kcal/4조각"))
                }
                4 -> {
                    orderList.add(Side(4, "MacWing", 4000, "245kcal / 2조각"))
                }
            }
            println("장바구니에 추가되었습니다.")
        }
        else if(purchaseOrNot == 2) {println("취소되었습니다.")}
        else {println("올바른 번호를 입력하세요.")}
    }

    fun addToBasketDessert(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    orderList.add(Dessert(1, "ApplePie", 1300, "사과 파이"))
                }
                2 -> {
                    orderList.add(Dessert(2, "Chiller", 2700, "과일맛 아이스 음료"))
                }
                3 -> {
                    orderList.add(Dessert(3, "Coleslaw", 2700, "샐러드"))
                }
                4 -> {
                    orderList.add(Dessert(4, "MacFlurry", 3000, "아이스크림"))
                }
            }
            println("장바구니에 추가되었습니다.")
        }
        else if(purchaseOrNot == 2) {println("취소되었습니다.")}
        else {println("올바른 번호를 입력하세요.")}
    }

}