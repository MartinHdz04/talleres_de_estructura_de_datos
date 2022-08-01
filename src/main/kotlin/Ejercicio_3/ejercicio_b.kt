package Ejercicio_3
/*
Entradas
valor alquiler-->Double-->valor_alquiler
número de estudiantes-->Int-->cant_estudiante
Salidas
Número de bicicletas-->Int-->num_bicicletas
Valor a pagar-->Double-->val_pagar
 */

//función
fun alquilar_bicicleta (val_alquiler:Double, cant_estudiante:Int):Pair<Int,Double>{
    val num_bicicletas = cant_estudiante/2
    val val_pagar = num_bicicletas*val_alquiler
    return Pair(num_bicicletas,val_pagar)
}
//programa
fun main(){


    println("Ingrese el valor del alquiler:")
    var val_alquiler = readLine()!!.toDouble()

    //Número de estudiantes en la universidad EAN 2018: 7'500.000 aprox (7500000)
    println("Ingrese el numero de estudiantes que utilizarán el servicio de bicicleta:")
    var cant_estudiante = readLine()!!.toInt()


    println("Son ${alquilar_bicicleta(val_alquiler,cant_estudiante).first} bicicletas y costará $${alquilar_bicicleta(val_alquiler,cant_estudiante).second}")
}