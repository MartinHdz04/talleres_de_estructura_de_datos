package Ejercicio_3
/*
Entradas
base-->Double-->base
altura-->Double-->altura
Salidas
area del triángulo-->Double-->(base*altura)/2
 */

//función
fun area_triangulo (base:Double,altura:Double):Double{
    return (base*altura)/2
}

//programa
fun main(){
    println("Escriba el valor de la base:")
    var base = readLine()!!.toDouble()
    println("Escriba el valor de la altura:")
    var altura = readLine()!!.toDouble()

    println("El valor del area del triángulo es: ${area_triangulo(base, altura)}")
}
