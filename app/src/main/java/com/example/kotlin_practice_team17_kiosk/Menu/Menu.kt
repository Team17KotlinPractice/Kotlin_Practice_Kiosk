package com.example.kotlin_practice_team17_kiosk.Menu

abstract class Menu (){

    abstract var name : String
    abstract var price : Int
    abstract var description : String

    abstract fun printMenu()

}