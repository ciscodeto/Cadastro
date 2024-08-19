package com.ciscodeto.cadastro

class Formulario {
    val name: String = ""
    val phoneNumber: String = ""
    val email: String = ""
    val isOnEmailList: Boolean = false
    val sex: String = ""
    val city: String = ""
    val state: String = ""

    override fun toString(): String {
        return "Nome: $name\n" +
                "Telefone: $phoneNumber\n" +
                "Email: $email\n" +
                "Lista de emails: $isOnEmailList\n" +
                "Sex: $sex" +
                "City: $city" +
                "State: $state"
    }
}