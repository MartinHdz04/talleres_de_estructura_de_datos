package Taller2

import kotlin.math.*
/*
Entradas
Estudiantes gordos-->Int-->g
Estudiantes flacos-->Int-->f
Sillas por bus-->Int-->sb
Salidas
Cantidad de buses-->Int-->buses
 */

//función
fun buses(g:Int, f:Int, sb:Int):Int{
    val cupo_gordos = (2*f).toDouble()
    val buses = ceil((cupo_gordos + f.toDouble())/sb.toDouble())
    return buses.toInt()
}

//porgrama
fun main(){
    print("¿Cuántas sillas hay en el bus?: ")
    val sb = readLine()!!.toInt()
    print("¿Cuántos estudiantes gordos van?: ")
    val g = readLine()!!.toInt()
    print("¿Cuántos estudiantes flacos van?: ")
    val f = readLine()!!.toInt()
    println("Usted necesitará ${buses(g, f, sb)} buses")
}