package Taller2

/*
Entradas
Variable x-->Double-->x
Variable y-->Double-->y
Salidas
Solución de la ecuación-->Double-->solucion
 */

//función
fun ecuacion(x:Double, y:Double):Double{
    val solucion=(2*x)-(2*x*y)+(2*y)
    return solucion
}

// programa
fun main(){
    print("Ingrese el valor de x: ")
    val x=readLine()!!.toDouble()
    print("Ingrese el valor de y: ")
    val y=readLine()!!.toDouble()
    println("La respuesta es: ${ecuacion(x, y)} ")
}