package com.example.kotlin_practice_team17_kiosk.side.drink

import com.example.kotlin_practice_team17_kiosk.Menu

abstract class Drink () : Menu(){
    abstract var name : String
    abstract override var price : Int
    abstract var description : String
    abstract fun printDrink()


}