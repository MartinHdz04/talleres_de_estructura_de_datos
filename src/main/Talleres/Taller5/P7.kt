package Taller5

fun placas(autos:MutableList<Pair<String, Double>>, referencia:String):Double{
    for ((placa, precio) in autos){
        if (placa==referencia){
            return precio
        }
    }
    return -1.0
}

fun main(){
    var autos:MutableList<Pair<String, Double>> = mutableListOf()

    print("¿Cuántos carros va a registrar?: ")
    val cant_car = readln().toInt()

    repeat(cant_car){
        print("Ingrese la placa del carro ${it+1}: ")
        var placa = readln()
        print("Ingrese el precio del carro ${it+1}: ")
        var precio = readln().toDouble()
        var carro = Pair(placa, precio)
        autos.add(carro)
    }
    print("Ingrese una placa para buscar el precio: ")
    var referencia = readln()
    print(placas(autos, referencia))
}