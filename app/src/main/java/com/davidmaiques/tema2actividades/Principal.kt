package com.davidmaiques.tema2actividades

import kotlin.math.roundToInt

fun main() {
    uno()
    dos()
}

fun dos() {
    val peso1=10.4F
    val peso2=30.35F
    val peso3=50F

    println("el promedio es ${(peso1+peso2+peso3)/3}")

    val resultado=peso1+peso2+peso3/3
    val redondear = String.format("%.2f", resultado)
    println("El promedio es ${redondear}")
    var redondear2= ((resultado * 100).roundToInt() / 100.0).toFloat()
    println(redondear2)


}

fun uno() {
    val lado = 50
    val superficie = 50 * 50
    val perimetro = 50 * 4
    println("La superficie del lado $lado es $superficie, y el perimetro es $perimetro")
}
