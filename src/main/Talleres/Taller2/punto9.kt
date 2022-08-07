package Taller2

fun num_mayor (x:Double, y:Double):Double?{
    var mayor:Double?=0.0
    if (x>y){mayor = x}
    else if(x<y){mayor = y}
    else if(x==y){print("Los valores son iguales..... ");mayor=null}
    return mayor
}

fun main(){
    print("Primer valor: "); val x = readLine()!!.toDouble()
    print("Segundo valor: "); val y = readLine()!!.toDouble()
    print("Valor más grande: ${num_mayor(x, y)}")
}