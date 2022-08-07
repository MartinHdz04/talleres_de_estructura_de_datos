package Taller2

fun nueva_sede(estudiantes:Int, capacidad_salon:Int, salon_por_piso:Int):Pair<Int, Int>{
    val num_salones = Math.ceil((estudiantes/capacidad_salon).toDouble())
    val num_pisos = Math.ceil((num_salones/salon_por_piso))
    return Pair(num_salones.toInt(), num_pisos.toInt())
}

fun main(){
    print("Ingrese el número de estudiantes: ")
    val estudiantes = readLine()!!.toInt()
    print("Ingrese la capacidad del salón: ")
    val capacidad_salon = readLine()!!.toInt()
    print("Ingrese los salones por piso: ")
    val salon_por_piso = readLine()!!.toInt()
    println("Necesitará ${nueva_sede(estudiantes, capacidad_salon, salon_por_piso).first} salones")
    println("Necesitará ${nueva_sede(estudiantes, capacidad_salon, salon_por_piso).second} pisos")
}