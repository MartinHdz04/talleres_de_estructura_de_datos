package Taller5

fun ver_ciudad(ciudades:MutableList<String>, referencia:String): Boolean{
    var valor=true
    for (ciudad in ciudades){
        if (ciudad == referencia){
            valor=true
        }else{
            valor=false
        }
    }
    return valor
}

fun main(){
    var ciudades:MutableList<String> = mutableListOf()
    var ciudad =""

    do{
        print("Ingrese una ciudad: ")
        ciudad=readln()
        ciudades.add(ciudad)

    }while(ciudad!="")

    print("Ingrese el nombre de una ciudad para buscarla en la lista: ")
    val referencia = readln()

    if(ver_ciudad(ciudades, referencia) == true){
        print("La ciudad existe")
    }else{
        print("La ciudad no existe")
    }
}