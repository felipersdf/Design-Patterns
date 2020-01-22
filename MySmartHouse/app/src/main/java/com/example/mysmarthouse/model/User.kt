package com.example.mysmarthouse.model

class User(var nome: String, var email: String, var login:String, var isAdm: Boolean) {

    override fun toString(): String {
        return "${nome} - ${login} - ${isAdm}"
    }
}