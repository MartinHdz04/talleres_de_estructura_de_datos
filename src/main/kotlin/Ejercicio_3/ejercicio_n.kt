package Ejercicio_3

/*
Entradas
número de computadores-->Int-->computadores
Salidas
Número de cables-->Int-->cables
 */

//función
fun calcula_cable (computadores:Int):Int{
    val cables = computadores/2
    return cables
}
//programa
fun main() {
    println("Ingrese el número de computadores:")
    var computadores = readLine()!!.toInt()
    println("Se usarán ${calcula_cable(computadores)} cables")
}