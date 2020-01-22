package com.example.mysmarthouse.model

import com.example.mysmarthouse.model.decorator_pattern.Scenario

class ConcreteScenario: Scenario  {

    override fun showScenario() {
        print("O cenário está vazio!")
    }

}