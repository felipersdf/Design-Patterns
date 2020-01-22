package com.example.mysmarthouse.model

class Oven (var isOn: Boolean ) {


    fun turnOn(){
        this.isOn = true
    }

    fun turnOff(){
        this.isOn = false
    }

    fun getName(): String{
        return "Fogão"
    }
}