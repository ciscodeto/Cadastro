package com.ciscodeto.cadastro

class Formulario(
    val name: String,
    val phoneNumber: String,
    val email: String,
    val isOnEmailList: Boolean,
    val sex: String,
    val city: String,
    val state: String
) {

    override fun toString(): String {
        return "Nome: $name\n" +
                "Telefone: $phoneNumber\n" +
                "Email: $email\n" +
                "Está na lista de emails: $isOnEmailList\n" +
                "Sexo: $sex" +
                "Cidade: $city" +
                "Estado: $state"
    }
}