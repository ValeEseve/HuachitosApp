package com.vantina.huachitos.domain.model

class Huachito(
    val id: Int,
    val nombre: String,
    val tipoAnimal: String,
    val edad: String,
    val estado: HuachitoState,
    val descripcionFisica: String,
    val descripcionPersonalidad: String,
    val descripcionExtra: String,
    val esterilizado: Boolean,
    val vacunas: Int,
    val urlImagen: String,
    val equipo: String,
    val region: String,
    val comuna: String,
    val url: String
)
