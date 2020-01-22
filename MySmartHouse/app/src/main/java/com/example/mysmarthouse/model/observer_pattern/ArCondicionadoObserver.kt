package com.example.mysmarthouse.model.observer_pattern

import kotlin.properties.Delegates

class ArCondicionadoObserver(listener: TemperatureChangeListener) {
    var temperatura: Int by Delegates.observable(
        initialValue = 0,
        onChange = {
            prop, old, new->
            listener.onValueChanged(new)
        })
}