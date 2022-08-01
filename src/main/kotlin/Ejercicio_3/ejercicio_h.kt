package Ejercicio_3

/*
Entradas
Velocidad del ciclista(kilometro/hora)-->Double-->vel_ci
Distancia entre las ciudades-->Double-->distancia
Salidas
Tiempo gastado(horas)-->Double-->tiempo
 */

//función
fun calculo_tiempo(vel_ci:Double, distancia:Double):Double{
    val tiempo = distancia / vel_ci
    return tiempo
}

//programa
fun main(){
    println("Ingrese la velocidad a la va el ciclista:")
    val vel_ci = readLine()!!.toDouble()
    println("Ingrese la distancia entre las ciudades:")
    val distancia = readLine()!!.toDouble()
    println("Tardará ${calculo_tiempo(vel_ci, distancia)} horas")
}