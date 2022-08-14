package Taller3

fun comision(ventas:Double)= when {
    ventas<50_000 && ventas>0 -> ventas*0.07
    ventas>=50_000 && ventas<100_000 -> ventas*0.09 + 5000
    ventas>=100_000 && ventas<200_000 -> ventas*0.11 + 10_000
    ventas>=200_000 && ventas<500_000 -> ventas*0.13 + 20_000
    ventas>=500_000 -> ventas*0.15 + 40_000
    else -> 0.0
}

fun main(){
    print("Ingrese el valor de las ventas del trabajador: ")
    var ventas = readLine()!!.toDouble()
    println("La comisión del trabajador es: ${comision(ventas)}")
    while(ventas>0){
        print("Ingrese el valor de las ventas del trabajador: ")
        ventas = readLine()!!.toDouble()
        println("La comisión del trabajador es: ${comision(ventas)}")
    }
}
