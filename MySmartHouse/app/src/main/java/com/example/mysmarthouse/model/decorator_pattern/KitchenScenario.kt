package com.example.mysmarthouse.model.decorator_pattern

import com.example.mysmarthouse.model.Light
import com.example.mysmarthouse.model.Oven
import com.example.mysmarthouse.model.Refrigerator
import com.example.mysmarthouse.model.Sensor

class KitchenScenario(l: Light, s:Sensor) : ScenarioDecorator(l,s) {

    lateinit var o: Oven
    lateinit var r: Refrigerator

    override public fun showScenario() {
        super.showScenario()
        this.addComponent(o);
        this.addComponent(r);
        println("O cenário possui luz, sensor e mais dois componente! \n ")
    }

    fun addComponent(o:Oven){
        println("O componente ${o.getName()} foi adicionado!")
    }

    fun addComponent(g:Refrigerator){
        println("O componente ${g.getName()} foi adicionado!")
    }
}