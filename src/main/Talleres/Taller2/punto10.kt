package Taller2

fun operacion(x:Double, y:Double, op:String)= when (op){
    "+"->println("suma ${x+y}")
    "-"->println("resta ${x-y}")
    "*"->println("multiplicación ${x*y}")
    "/"->println("división ${x/y}")
    "%"->println("modulo ${Math.floorMod(x.toInt(), y.toInt())}")
    "**"->println("potenciación ${Math.pow(x, y)}")
    else->println("valor no coincide")
}

fun main(){
    print("Ingrese el primer valor: ")
    val x = readLine()!!.toDouble()
    print("Ingrese el segundo valor: ")
    val y = readLine()!!.toDouble()
    print("Ingrese la operación (+, -, *, /, %, **): ")
    val op = readLine()!!
    operacion(x, y, op)
}