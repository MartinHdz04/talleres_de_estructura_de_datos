package Taller3

fun num_perfectos(num:Int):Boolean {if(sum_divisores(num)==num)return true else return false}

fun main(){
    print("Ingrese un número: ")
    val num=readLine()!!.toInt()
    var cant_perfectos=0
    repeat(num){
        if(num_perfectos(it+1)==true){
            println("${it+1} es perfecto")
            cant_perfectos++
        }
    }
    print("Cantidad de números perfectos entre 1 y $num: $cant_perfectos")
}