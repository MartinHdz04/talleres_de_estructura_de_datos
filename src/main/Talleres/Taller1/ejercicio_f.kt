package Taller1

/*
Entradas
Horas de uso-->Double-->horas
Salidas
Costo a pagar-->Double-->costo
 */

//función
fun calcula_cobro (horas:Double):Double{
    val tarifa = 1200.5
    val costo = tarifa*(horas.toInt())
    return costo
}

//programa
fun main(){
    println("¿Cuántas horas uso el estacionamiento?:")
    val horas = readLine()!!.toDouble()
    println("Total a pagar: ${calcula_cobro(horas)}")
}
