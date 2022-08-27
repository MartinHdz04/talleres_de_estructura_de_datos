package Taller4

fun main(){
    var conta = 1
    var altMax = 0F
    do{
        print("Ingrese la altura (metros) del estudiante $conta: ")
        var alt= readln().toFloat()
        conta++

        if (alt > altMax){altMax=alt}
        print("Para continuar digite enter: ")
        var continuar= readln()
    }while(continuar == "")
    print("Altura mayor: $altMax")
}