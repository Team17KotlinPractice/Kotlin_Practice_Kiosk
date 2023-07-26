package com.example.kotlin_practice_team17_kiosk.dessert

import com.example.kotlin_practice_team17_kiosk.Menu

abstract class Dessert() : Menu() {
    abstract var name : String
    abstract override var price : Int
    abstract var description : String
    abstract fun printDessert()
}