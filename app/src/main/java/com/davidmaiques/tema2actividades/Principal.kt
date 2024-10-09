package com.davidmaiques.tema2actividades


import java.util.InputMismatchException
import java.util.Scanner
import kotlin.collections.ArrayList
import kotlin.math.roundToInt
import kotlin.random.Random

var scM = Scanner(System.`in`)
fun main() {

    //uno()
    //dos()
    //tres()
    //cuatro()
    //cinco()
    //seis()
    //siete()
    //ocho()
    //nueve()
    //diez(1,2,35,8)
    //once(50,25,8,12,69,12)
    //doce(1 esMayorQue  3)
    //***ARRAYS***
    //trece()
    //catorce()
    // quince()
    //****when***
    //dieciseis()
    rangoWhen()


}

fun rangoWhen() {
    var contador = 0
    var cero = 0
    var impares = 0
    var pares = 0
    var distintoCero = 0;

    while (contador < 10) {
        println("ingresa un valor")
        var valor: Int = 0
        try {
            valor = scM.nextInt()
        } catch (e: InputMismatchException) {
            println("Valor no valido")
            break
        }
        when {
            valor == 0 -> cero++
            valor % 2 != 0 -> impares++
            valor % 2 == 0 -> pares++
            valor != 0 -> distintoCero++
        }
        contador++
    }
    println("Hay $cero ceros y $distintoCero distintos de cero")
    println("Hay $impares impares y $pares pares")

}

fun dieciseis() {
    var contador = 0
    var cero = 0
    var distintoCero = 0;
    while (contador < 10) {
        println("ingresa un valor")
        var valor = scM.nextInt()
        when (valor) {
            0 -> cero++
            else -> distintoCero++
        }
        contador++
    }
    println("Hay $cero ceros y $distintoCero distintos de cero")
}

fun crearArray(elementos: Int): MutableList<Int> {
    var contador = 0
    var lista: MutableList<Int> = mutableListOf()
    while (contador < elementos) {
        println("Ingresa el elemento ${contador++}")
        lista.add(scM.nextInt())
    }
    return lista
}

fun quince() {

    println("Ingresa el numero de elementos")
    var elementos = scM.nextInt()
    var lista: MutableList<Int> = crearArray(elementos)
    println("La suma es: ${lista.sum()}")

}

fun catorce() {
    var contador = 0
    val lista1: MutableList<Int> = mutableListOf()
    val lista2: MutableList<Int> = mutableListOf()
    var lista1Completa = false

    while (contador < 4) {
        println("Ingresa valor ${++contador} ")
        if (!lista1Completa) {
            lista1.add(scM.nextInt())
            if (lista1.size == 4) {
                contador = 0
                lista1Completa = true
            }
        } else {
            lista2.add(scM.nextInt())
        }
    }

    println("Elementos de lista1 $lista1")
    println("Elementos de lista2 $lista2")

    var sumas: MutableList<Int> = mutableListOf()
    for (i in 0 until 4) {
        println("La suma de ${lista1[i]} + ${lista2[i]} = ${lista1[i] + lista2[i]}")
        sumas.add(lista1[i] + lista2[i])
    }

    println(sumas)

    var resultado: MutableList<Int> = lista1.zip(lista2) { a, b -> a + b }.toMutableList()
    println(lista1.zip(lista2))
    println(resultado)
}

fun trece() {
    val lista = List(10) { Random.nextInt(0, 100) }
    println(lista)

    var resultado = lista.zip(lista.drop(1)).all { (a, b) -> a < b }
    println("Cada elemento es mayor al siguiente $resultado")


    var resultado2: Boolean = true
    for (i in 0 until lista.size) { // exclute el ultimo valor
        if (lista[i] < lista[i + 1]) {
            resultado2 = true
        } else {
            resultado2 = false
            break
        }
    }
    println("Cada elemento es mayor al siguiente $resultado2")


    var resultado3: Boolean = true
    for (i in 0..lista.size - 1) {// incluye todos los vlaores
        if (lista[i] < lista[i + 1]) {
            resultado3 = true
        } else {
            resultado3 = false
            break
        }
    }
    println("Cada elemento es mayor al siguiente $resultado3")


    /*
    * lista.zip(lista.drop(1)): empareja lista con lista cayyendo el priemr elemento

 lista.drop(1): Esta función crea una nueva lista que contiene todos los elementos de lista, excepto el primero. Por ejemplo, si lista es [1, 2, 3, 4, 5], entonces lista.drop(1) será [2, 3, 4, 5].
 zip: Combina lista con su versión "recortada" (lista.drop(1)) en pares. Así, tendrás: [(1, 2), (2, 3), (3, 4), (4, 5)].
 all{(a, b) -> a < b}:

 all: Esta función se utiliza para verificar si todos los elementos de la colección cumplen la condición especificada en la lambda.
 (a, b) -> a < b: Aquí, a es el elemento actual y b es el siguiente elemento del par. La expresión devuelve true si a es menor que b.*/
}

fun doce(b: Boolean) {
    println(b)
}

infix fun Int.esMayorQue(i: Int): Boolean {
    return this > i
}

fun once(vararg edades: Int) {
    var lista = ArrayList<Int>(edades.toList())
    println("Hay ${lista.filter { it >= 18 }.count()} personas mayores de 17")
    lista.filter { it >= 18 }.forEach { print("$it ") }
}

fun diez(vararg numeros: Int) {
    var lista = ArrayList<Int>(numeros.toList())
    println("La suma es: ${lista.sum()}")
}

fun nueve() {
    val lista = valores()
    val menor = calculoMenor(lista)
    println("El menor es $menor")
}

fun ocho() {
    val lista: ArrayList<Int> = valores()

    val mayor = calculoMayor(lista)
    val menor = calculoMenor(lista)
    val media = calculoMedia(lista)
    val suma = lista.sum()
    println("El mayor es $mayor \nEl menor es: $menor \nLa media es $media \nLa suma es $suma")
}

fun valores(): ArrayList<Int> {
    val lista = ArrayList<Int>()
    var contador = 0
    val sc = Scanner(System.`in`)

    while (contador < 30) {
        println("Ingresa un valor")
        lista.add(sc.nextInt())
        contador += 10
    }
    return lista
}

fun calculoMedia(lista: ArrayList<Int>) = lista.average()
fun calculoMenor(lista: ArrayList<Int>) = lista.min()
fun calculoMayor(i: ArrayList<Int>) = i.max()
fun siete() {
    val entrada1: String
    val entrada2: String
    val sc = Scanner(System.`in`)
    println("Ingresa una clave")
    entrada1 = sc.nextLine()
    println("Ingresa una clave")
    entrada2 = sc.nextLine()
    println(if (entrada1 == entrada2) "Las entradas son iguales" else "Las entradas son distintas")
}

fun seis() {

    val sc = Scanner(System.`in`)
    var contador = 3
    val lista = ArrayList<Int>()
    while (contador != 0) {
        println("Ingresa un numero")
        lista.add(sc.nextInt())
        contador--
    }
    println("el menor es ${lista.min()} ")

}

fun cinco() {
    cuadrado()
    doble()
}

fun doble() {
    cuadrado()
    cuadrado()
}

fun cuadrado() {
    val sc = Scanner(System.`in`)
    val numero: Int
    println("Ingresa un numero")
    numero = sc.nextInt()
    println("El cuadrado es ${numero * numero}")

}

fun cuatro() {
    val sc = Scanner(System.`in`)
    val precio: Float
    val cantidad: Int

    println("Precio?: ")
    precio = sc.nextFloat()
    println("Cantidad:")
    cantidad = sc.nextInt()

    println("$cantidad cuestan: $precio euros")

}

fun tres() {
    val sc = Scanner(System.`in`)
    var contador = 0
    val lista = ArrayList<Int>()
    while (contador < 4) {
        println("Ingersa un numero entero")
        lista.add(sc.nextInt())
        contador++
    }
    println("La suma de los 2 primeros valores son: ${lista[0]} + ${lista[1]} = ${lista[0] + lista[1]}")
    println("El producto de los 2 ultimos valores son: ${lista[2]} x ${lista[3]} = ${lista[2] * lista[3]}")
}

fun dos() {
    val peso1 = 10.4F
    val peso2 = 30.35F
    val peso3 = 50F

    println("el promedio es ${(peso1 + peso2 + peso3) / 3}")

    val resultado = peso1 + peso2 + peso3 / 3
    val redondear = String.format("%.2f", resultado)
    println("El promedio es ${redondear}")
    var redondear2 = ((resultado * 100).roundToInt() / 100.0).toFloat()
    println(redondear2)


}

fun uno() {
    val lado = 50
    val superficie = 50 * 50
    val perimetro = 50 * 4
    println("La superficie del lado $lado es $superficie, y el perimetro es $perimetro")
}
