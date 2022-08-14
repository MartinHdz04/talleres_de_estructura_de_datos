package Taller3

fun factorial(num:Int){
    var factorial=1
    for (i in 1..num){factorial=factorial * i}
    println("El factorial de $num es: $factorial")
}

fun main(){
    print("Ingrese un entero: ")
    val num = readLine()!!.toInt()
    repeat(num){factorial(it+1)}
}