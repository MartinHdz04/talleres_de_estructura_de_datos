package Taller5

fun cverbos(palabras:MutableList<String>):Int{
    var canverbos=0
    for (palabra in palabras){
        if(palabra.trim().lowercase().endsWith("ar") || palabra.trim().lowercase().endsWith("er") || palabra.trim().lowercase().endsWith("ir")){
            canverbos++
        }
    }
    return canverbos
}

fun main(){
    var palabras:MutableList<String> = mutableListOf()
    var continuar = ""

    var palabra:String
    do{
        print("Ingrese una palabra: ")
        palabra=readLine()!!
        palabras.add(palabra)
        print("Para ingresar otra palabra oprima enter, para terminar cualquier otra tecla: ")
        continuar=readLine()!!
    }while(continuar=="")
    println("De las ${palabras.size} palabras, ${cverbos(palabras)} son verbos")
}