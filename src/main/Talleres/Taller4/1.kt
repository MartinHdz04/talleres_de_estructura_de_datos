package Taller4

fun main(){
    var pasaron = 0
    var suma = 0.0
    var n100 = 0
    var n10 = 0

    print("Ingrese la cantidad de estudiantes que pertencen a la unidad: ")
    val reps = readln().toInt()
    print("Ingrese con cuanto se pasa la unidad: ")
    val ref = readln().toDouble()
    repeat(reps){
        print("Primer parcial del estudiante ${it+1}: ")
        var p1 = readln().toDouble() * 0.25
        print("Primer parcial del estudiante ${it+1}: ")
        var p2 = readln().toDouble() * 0.25
        print("Primer parcial del estudiante ${it+1}: ")
        var pf = readln().toDouble() * 0.5
        println("Nota definita del estudiante ${it+1}: ${p1+p2+pf}")

        suma+=(p1+p2+pf)
        if((p1+p2+pf)>ref){pasaron++}
        if((p1+p2+pf)==100.0){n100++}
        if((p1+p2+pf)==10.0){n10++}
    }

    println("Pasaron la materia: $pasaron")
    println("No pasaron la materia: ${reps-pasaron}")
    println("Notas con 100: $n100")
    println("Notas con 10: $n10")
    println("Promedio del curso: ${suma/reps}")
}