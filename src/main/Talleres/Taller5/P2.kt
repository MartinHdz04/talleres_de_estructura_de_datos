package Taller5

fun alt_bajoProm (alturas:MutableList<Float>, referencia:Float):Int{
    var cant_bp=0
    for (altura in alturas){
        if (altura<referencia){
            cant_bp++
        }
    }
    return cant_bp
}

fun prom_alt (alturas:MutableList<Float>):Float{
    var suma = 0F
    for (altura in alturas){
        suma += altura
    }
    return (suma/alturas.size)
}

fun main(){
    var alturas:MutableList<Float> = mutableListOf()
    var altura:Float
    print("Ingrese la referencia: ")
    var referencia = readLine()!!.toFloat()
    do{
       print("Ingrese una altura: ")
       altura = readLine()!!.toFloat()
       alturas.add(altura)
    }while(altura>0F && altura<3F)
    println("Alturas debajo de la referencia: ${alt_bajoProm(alturas, referencia)}")
    println("Promedio de las alturas: ${prom_alt(alturas)}")
}