package Taller4

fun main(){
    var max=0.0 ; var min=99999999.0 ; var par=0 ; var impar=0 ; var sum=0.0 ; var cant=0
    do{
        print("Ingrese un número: ")
        var num=readln().toDouble()
        if (num<=0){break}

        if(num>max){max=num}
        if(num<min){min=num}
        if(num%2 == 0.0){par++}else{impar++}
        sum+=num ; cant++

    }while(num>0)
    println("Valor max: $max")
    println("Valor min: ${if(cant==0){0.0}else{min}}")
    println("Números pares: $par")
    println("Números impares: $impar")
    println("Promedio de valores: ${if(cant!=0){sum/cant}else{0}}")
}