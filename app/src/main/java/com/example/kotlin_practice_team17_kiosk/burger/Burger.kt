package com.example.kotlin_practice_team17_kiosk.burger

import com.example.kotlin_practice_team17_kiosk.Menu

abstract class Burger () : Menu(){
    abstract var name : String
    abstract override var price : Int
    abstract var description : String
    abstract fun printBurger()


}