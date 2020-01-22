package com.example.mysmarthouse.model

class Ar(var isOn:Boolean, var temp: Int) {

    fun turnOn(){
        this.isOn = true
    }
    fun turnOff(){
        this.isOn = false
    }

    fun setTemperature(temperature: Int){
        if (!this.isOn)
            print("O ar está desligado")
        else
            this.temp = temperature
    }


    fun getName(): String{
        return "Ar-condicionado"
    }
}
