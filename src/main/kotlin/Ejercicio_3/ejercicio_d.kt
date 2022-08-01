package Ejercicio_3

/*
Entradas
Cantidad de pesos a cambiar-->Double-->cant_pesos
Salidas
Dolares a recibir-->Double-->cant_pesos/dolar
 */

fun pesos_a_dolar(cant_pesos:Double):Double{
    //dolar el 27/07/2022
    val dolar = 4429.46
    return cant_pesos/dolar
}
 fun main(){
     println("¿Cuántos pesos desea cambiar?:")
     var cant_pesos = readLine()!!.toDouble()
     var cant_dolar = pesos_a_dolar(cant_pesos)
     println("Usted recibe: ${cant_dolar.toInt()} dolares, le sobran: ${cant_dolar-cant_dolar.toInt()} pesos")
 }