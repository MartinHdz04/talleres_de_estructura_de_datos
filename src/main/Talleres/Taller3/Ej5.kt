package Taller3

fun main(){
    print("Ingrese n: ")
    val n = readLine()!!.toInt()
    var suma=0
    for (i in 1..n){
        suma=suma + i
        print("$i")
        if(i!=n){print(" + ") }
        else{println("")}
    }
    print("La suma es: $suma")
}