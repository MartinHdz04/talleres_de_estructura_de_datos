package Taller5

fun mas_viejo(personas:MutableList<Pair<String, Int>>):String {
    var viejo = 2022
    var viejostr=""
    for ((persona, edad) in personas){
        if(edad<=viejo){
            viejostr = persona
        }
    }
    return viejostr
}

fun main(){
    var personas:MutableList<Pair<String, Int>> = mutableListOf()
    print("¿Cuántos estudiantes va a registrar?: ")
    var cant_est = readln().toInt()

    repeat(cant_est){
        print("Ingrese el nombre del estudiante ${it+1}: ")
        var nombre = readln()
        print("Ingrese el año de nacimiento del estudiante ${it+1}: ")
        var edad = readln().toInt()
        var estudiante = Pair(nombre, edad)
        personas.add(estudiante)
    }
    print("El estudiante más viejo: ${mas_viejo(personas)}")
}