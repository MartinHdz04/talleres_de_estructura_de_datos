package Taller3

fun sum_divisores(num:Int):Int{
    var suma=0
    for(i in 1..num){
        if(num%i == 0){
            suma=suma+i
        }
    }
    return (suma-num)
}

fun main(){
    print("Ingrese un número entero: ")
    val num = readLine()!!.toInt()
    print("La suma de los divisores de $num menos $num es: ${sum_divisores(num)}")
}