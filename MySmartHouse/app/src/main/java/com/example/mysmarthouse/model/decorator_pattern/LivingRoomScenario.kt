package com.example.mysmarthouse.model.decorator_pattern

import com.example.mysmarthouse.model.*

class LivingRoomScenario(l: Light, s: Sensor) : ScenarioDecorator(l,s) {

    lateinit var t: TV
    lateinit var a: Ar

    override public fun showScenario() {
        super.showScenario()
        this.addComponent(t);
        this.addComponent(a);
        println("O cenário possui luz, sensor e mais dois componente! \n ")
    }

    fun addComponent(t: TV){
        println("O componente ${t.getName()} foi adicionado!")
    }

    fun addComponent(a: Ar){
        println("O componente ${a.getName()} foi adicionado!")
    }
}