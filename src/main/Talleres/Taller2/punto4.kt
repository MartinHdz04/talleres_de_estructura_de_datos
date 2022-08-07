package Taller2

/*
Entradas
Sueldo de pedro-->Double-->sueldo
Salidas
Dinero para el arriendo-->Double-->arriendo
Dinero para la comida-->Double-->comida
Dinero restante-->Double-->restante
 */

//función
fun mensualidad(sueldo:Double):Triple<Double, Double, Double>{
    val arriendo = sueldo*0.4
    val comida = sueldo*0.15
    val restante = sueldo*0.45
    return Triple(arriendo, comida, restante)
}

//programa
fun main(){
    print("Ingrese el sueldo de Pedro: ")
    val sueldo = readLine()!!.toDouble()
    println("Arriendo: ${mensualidad(sueldo).first}")
    println("Comida: ${mensualidad(sueldo).second}")
    println("Restante: ${mensualidad(sueldo).third}")
}