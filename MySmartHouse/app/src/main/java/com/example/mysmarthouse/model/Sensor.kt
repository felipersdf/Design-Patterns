package com.example.mysmarthouse.model

class Sensor (var isOn: Boolean){

    fun turnOn (){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }
}