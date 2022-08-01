package Ejercicio_3

/*
Entradas
Metros cuadrados pintados-->Double-->m_pintados
Salidas
Total a pagar-->Int-->costo
 */

//función
fun calculo_pago (m_pintados:Double):Int{
    val peso_por_metro = 4000
    val costo = m_pintados*peso_por_metro
    return costo.toInt()
}

//programa
fun main(){
    println("Ingrese los metros cuadrados pintado:")
    val m_pintados = readLine()!!.toDouble()
    println("El costo es $${calculo_pago(m_pintados)}")
}