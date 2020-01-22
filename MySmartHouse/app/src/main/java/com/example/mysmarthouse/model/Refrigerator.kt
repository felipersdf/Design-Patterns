package com.example.mysmarthouse.model

class Refrigerator {

    var isOn: Boolean
    var qtdItens: Int

    init {
        isOn = false
        qtdItens = 0
    }

    fun addItem() {

        if(getSize() === 30){
            print("The refrigerator is full")
        }else{
            qtdItens++
        }
    }

    fun removeItem(){
        if(getSize() === 0){
            print("The refrigerator is empty")
        } else{
            qtdItens--
        }
    }

    fun getSize(): Int{
        return qtdItens
    }


    fun turnOn(){
        this.isOn = true
    }

    fun turnOff(){
        this.isOn = false
    }

    fun getName(): String{
        return "Geladeira"
    }


}