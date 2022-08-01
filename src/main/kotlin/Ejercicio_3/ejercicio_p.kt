package Ejercicio_3

/*
Entradas
Archivo de descarga-->Double-->descarga
Velocidad del Internet-->Double-->velocidad
Salidas
Tiempo de descarga-->Double-->tiempo
 */

//función
fun tiempo_descarga (descarga:Double, velocidad:Double):Double{
    val tiempo = descarga/velocidad
    return tiempo
}