package Ejercicio_3

/*
Entradas
población-->Int-->poblacion
Salidas
Dato de los desempleados-->Int-->desemplaeados
 */

//función
fun cal_desempleo (poblacion:Int):Int{
    //Contante del promedio de desempleados
    val porcentaje_desempleo:Float = 0.0815F
    var desempleados = poblacion*porcentaje_desempleo
    return desempleados.toInt()
}

//programa
fun main(){
    /*Población activa en colombia para 2021: 25'913.375 (25913375)
    https://datos.bancomundial.org/indicator/SL.TLF.TOTL.IN?locations=CO*/

    println("Ingresa el valor de la población:")
    var poblacion = readLine()!!.toInt()
    println("El número de desempleados es: ${cal_desempleo(poblacion)}")
}