package com.example.kotlin_practice_team17_kiosk_2ver

import com.example.kotlin_practice_team17_kiosk_2ver.menu.Burger
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Dessert
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Drink
import com.example.kotlin_practice_team17_kiosk_2ver.menu.Side

class MenuController {
    fun addBurgerMenu() {
        val bigMac = Burger(1,"빅맥",5200,"빅맥 버거")
        val doubleQuarter = Burger(2,"더블쿼터파운드치드",7600,"더블 쿼터 파운드 치즈 버거")
        val macCrispy = Burger(3,"맥크리스피",5900,"맥크리스피 버거")
        val shanghai = Burger(4,"상하이",5200,"맥 스파이시 상하이 버거")

        burgerMenuList.add(bigMac)
        burgerMenuList.add(doubleQuarter)
        burgerMenuList.add(macCrispy)
        burgerMenuList.add(shanghai)
    }

    fun addDrinkMenu() {
        val coke = Drink(1,"콜라", 2000, "코카 콜라")
        val sprite = Drink(2,"사이다", 2000, "스프라이트")
        val fanta = Drink(3,"환타",2000,"환타 오렌지맛")
        val zeroCoke = Drink(4,"제로콜라",2000,"코카콜라 제로")

        drinkMenuList.add(coke)
        drinkMenuList.add(sprite)
        drinkMenuList.add(fanta)
        drinkMenuList.add(zeroCoke)
    }

    fun addSideMenu() {
        val cheezeStick = Side(1,"치즈스틱",3300,"골든 모짜렐라 치즈스틱 / 150kcal")
        val frenchFries = Side(2,"감자튀김",2800,"후렌치 후라이/324kcal")
        val macNugget = Side(3,"맥너겟",3300,"163kcal/4조각")
        val macWing = Side(4,"맥윙",4000,"245kcal / 2조각")

        sideMenuList.add(cheezeStick)
        sideMenuList.add(frenchFries)
        sideMenuList.add(macNugget)
        sideMenuList.add(macWing)
    }

    fun addDessertMenu() {
        val applePie = Dessert(1,"ApplePie",1300,"사과를 넣어 구운 파이")
        val chiller = Dessert(2,"Chiller",2700,"과즙과 얼음을 갈아 넣은 과일맛 아이스 음료")
        val coleslaw = Dessert(3,"Coleslaw",2700,"샐러드")
        val macFlurry = Dessert(4,"MacFlurry",3000,"컴에 담은 소프트 아이스크림에 각종 재료를 섞은 디저트")

        dessertMenuList.add(applePie)
        dessertMenuList.add(chiller)
        dessertMenuList.add(coleslaw)
        dessertMenuList.add(macFlurry)
    }
}