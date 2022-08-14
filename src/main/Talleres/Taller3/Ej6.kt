package Taller3

fun main(){
    print("Ingrese el número al que se le va a elaborar la tabla: ")
    val numero = readLine()!!.toInt()
    repeat(10){
        println("$numero x ${it+1} = ${numero*(it+1)}")
    }
}