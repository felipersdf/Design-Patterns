package com.example.mysmarthouse.model.decorator_pattern

import com.example.mysmarthouse.model.Light
import com.example.mysmarthouse.model.Sensor

open class ScenarioDecorator(protected  var light: Light, protected var sensor: Sensor): Scenario{

    override fun showScenario() {
        println("O cenário possui luz e sensor! \n " +
                "A luz está ligada: ${this.light.isOn} " +
                "e o sensor está ligado: ${this.sensor.isOn}")
    }
}