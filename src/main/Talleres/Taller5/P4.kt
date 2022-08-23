package Taller5

fun cal_notas(notas:MutableList<Float>, referencia:Float):Pair<Int, Float>{
    var cant_per=0
    var suma = 0F
    for (nota in notas){
        if (nota<referencia){
            cant_per++
        }
        suma+=nota
    }
    return Pair(cant_per, suma/notas.size)
}

fun main(){
    print("¿Cuántos estudianes va a registrar: ")
    val cant_estudiantes= readln().toInt()
    print("¿Con cuánto se pasa la materia: ")
    val referencia = readln().toFloat()

    var notas:MutableList<Float> = mutableListOf()

    repeat(cant_estudiantes){
        print("Ingrese la nota del estudiante ${it+1}: ")
        var nota=readln().toFloat()
        notas.add(nota)
    }

    println("La cantidad de estudiantes que perdieron: ${cal_notas(notas, referencia).first}")
    println("El promedio del curso: ${cal_notas(notas, referencia).second}")
}