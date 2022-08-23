package Taller5

fun area_tri(base:Double, alt:Double)=base*alt/2

fun n_mayor (triangulos:MutableList<Triple<String, Double, Double>>):String{
    var amax = 0.0
    var nmax = ""
    for ((nombre, base, altura) in triangulos){
        var a = area_tri(base, altura)
        if(a>amax){
            amax=a
            nmax=nombre
        }
    }
    return nmax
}

fun a_mayor(triangulos:MutableList<Triple<String, Double, Double>>, referencia:String):Double{
    for ((nombre, base, altura) in triangulos){
        if (referencia == nombre){
            return area_tri(base, altura)
        }
    }
    return -1.0
}

fun main(){
    var triangulos:MutableList<Triple<String, Double, Double>> = mutableListOf()

    print("¿Cuántos triángulos va a registrar: ")
    val cant_reps = readln().toInt()
    repeat(cant_reps){
        print("Nombre del triángulo ${it+1}: ")
        var nombre = readln()
        print("Base del triángulo ${it+1}: ")
        var base = readln().toDouble()
        print("Altura del triángulo ${it+1}: ")
        var altura = readln().toDouble()
        var triangulo = Triple(nombre, base, altura)
        triangulos.add(triangulo)
    }
    println("El trinagulo de mayor area es: ${n_mayor(triangulos)}")
    print("El area de ${n_mayor(triangulos)} es : ${a_mayor(triangulos, n_mayor(triangulos))}")
}