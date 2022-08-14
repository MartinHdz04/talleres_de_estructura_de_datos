package Taller3

fun divisores(num:Int):Int{
    var cant_div=0
    for (i in 1..num){
        if(num%i == 0){
            cant_div=cant_div+1
        }
    }
    return cant_div
}

fun main(){
    print("Ingrese un número: ")
    val num = readLine()!!.toInt()
    print("Cantidad de divisores: ${divisores(num)}")
}