package com.example.mysmarthouse.model

class TV (var isOn: Boolean) {

    fun turnOn(){
        this.isOn = true
    }

    fun turnOff(){
        this.isOn = false
    }

    fun getName(): String{
        return "TV"
    }
}
