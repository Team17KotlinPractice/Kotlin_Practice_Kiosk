package com.example.kotlin_practice_team17_kiosk_2ver

import com.example.kotlin_practice_team17_kiosk_2ver.menu.Burger
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Dessert
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Drink
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Side

class BasketAdder {
    fun addToBasketBurger(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    menuList.add(Burger(1,"빅맥",5200,"빅맥 버거"))
                }
                2 -> {
                    menuList.add(Burger(2,"더블쿼터파운드치드",7600,"더블 쿼터 파운드 치즈 버거"))
                }
                3 -> {
                    menuList.add(Burger(3,"맥크리스피",5900,"맥크리스피 버거"))
                }
                4 -> {
                    menuList.add(Burger(4,"상하이",5200,"맥 스파이시 상하이 버거"))
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요")}
    }

    fun addToBasketDrink(purchaseOrNot : Int, choice : Int) {
        if(purchaseOrNot == 1) {
            when(choice) {
                1-> {
                    menuList.add(Drink(1,"콜라", 2000, "코카 콜라"))
                }
                2 -> {
                    menuList.add(Drink(2,"사이다", 2000, "스프라이트"))
                }
                3 -> {
                    menuList.add(Drink(3,"환타",2000,"환타 오렌지맛"))
                }
                4 -> {
                    menuList.add(Drink(4,"제로콜라",2000,"코카콜라 제로"))
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
                    menuList.add(Side(1,"치즈스틱",3300,"골든 모짜렐라 치즈스틱 / 150kcal"))
                }
                2 -> {
                    menuList.add(Side(2,"감자튀김",2800,"후렌치 후라이/324kcal"))
                }
                3 -> {
                    menuList.add(Side(3,"맥너겟",3300,"163kcal/4조각"))
                }
                4 -> {
                    menuList.add(Side(4,"맥윙",4000,"245kcal / 2조각"))
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
                    menuList.add(Dessert(1,"ApplePie",1300,"사과를 넣어 구운 파이"))
                }
                2 -> {
                    menuList.add(Dessert(2,"Chiller",2700,"과즙과 얼음을 갈아 넣은 과일맛 아이스 음료"))
                }
                3 -> {
                    menuList.add(Dessert(3,"Coleslaw",2700,"샐러드"))
                }
                4 -> {
                    menuList.add(Dessert(4,"MacFlurry",3000,"컴에 담은 소프트 아이스크림에 각종 재료를 섞은 디저트"))
                }
            }
        }
        else if(purchaseOrNot == 2)
        else {println("올바른 번호를 입력하세요.")}
    }
}