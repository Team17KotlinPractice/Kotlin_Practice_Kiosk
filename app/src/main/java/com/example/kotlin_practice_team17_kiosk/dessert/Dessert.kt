package com.example.kotlin_practice_team17_kiosk.dessert

abstract class Dessert()  {
    abstract var name : String
    abstract var price : Int
    abstract var description : String
    abstract fun printDessert()
}