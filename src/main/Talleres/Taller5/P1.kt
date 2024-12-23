package Taller5

fun siglo_pas (edades:MutableList<Int>):Pair<Int, Double>{
    var suma=0
    var siglo_pas = 0
    for (edad in edades){
        if(edad>=23){
            siglo_pas++
        }
        suma += edad
    }
    return Pair(siglo_pas,(suma/edades.size).toDouble())
}

fun main(){
    var edades:MutableList<Int> = mutableListOf()
    print("¿Cuántos estudiantes va a ingresar?: ")
    val estudiantes = readLine()!!.toInt()

    repeat(estudiantes){
        print("Ingrese la edad del estudiante ${it+1}: ")
        var estudiante=readLine()!!.toInt()
        edades.add(estudiante)
    }

    println("Estudiantes del siglo pasado: ${siglo_pas(edades).first}")
    println("Promedio de las edades de los estudiantes: ${siglo_pas(edades).second}")
}