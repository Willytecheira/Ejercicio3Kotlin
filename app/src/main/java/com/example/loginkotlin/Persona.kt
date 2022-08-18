package com.example.loginkotlin

class Persona {

    private var nombre : String
    private var telefono : String
    private var edad : String

    constructor(nombre: String, telefono: String, edad: String) {
        this.nombre = nombre
        this.telefono = telefono
        this.edad = edad
    }


    fun getNombre(): String {
        return this.nombre
    }

    fun getTelefono(): String {
        return this.telefono
    }

    fun getEdad(): String {
        return this.edad
    }

    fun setNombre(nombre : String){
        this.nombre = nombre
    }

    fun setTelefono(telefono : String){
        this.telefono = telefono
    }

    fun setEdad(edad : String){
        this.edad = edad
    }

}