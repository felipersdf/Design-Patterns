package com.example.mysmarthouse.model.observer_pattern

class ChangingTemperatureBySensorListener: TemperatureChangeListener {

    override fun onValueChanged(newValue: Int) {
        println("A temperatura do ambiente mudou. O ar foi ajustado para ${newValue}.")
    }
}