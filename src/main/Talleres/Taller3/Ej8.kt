package Taller3

fun verificar_primo(num:Int):Boolean{if(divisores(num)==2) return true else return false}

fun main(){
    print("Ingrese un numero entero: ")
    val num=readLine()!!.toInt()
    if(num>2){println("Números primos entre 2 y $num:")
        for(i in 2..num)
            if(verificar_primo(i)==true){println(i)}
    }
    else{println("Numeros primos entre $num y 2:")
        for(i in num..2){
            if(verificar_primo(i)==true){println(i)}
        }
    }
}