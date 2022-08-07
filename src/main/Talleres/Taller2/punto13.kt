package Taller2

fun aumento (sueldo:Double):Pair<Double, Double>{
    var aumento = 0.0
    if (sueldo>0.0 && sueldo<800000.0){aumento = sueldo*0.1}
    else if (sueldo>800000.0 && sueldo<1200000.0){aumento = sueldo*0.08}
    else if (sueldo>1200000.0){aumento = sueldo*0.05}
    val nuevoSueldo = sueldo+aumento
    return Pair(nuevoSueldo, aumento)
}

fun main(){
    println("Ingrese el sueldo: ");val sueldo=readLine()!!.toDouble()
    println("El nuevo sueldo es: ${aumento(sueldo).first}")
    println("El aumento es de: ${aumento(sueldo).second}")
}