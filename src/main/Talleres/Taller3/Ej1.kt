package Taller3

fun precio_libro(precio:Double):Double{
    var precio_neto=0.0
    if (precio<100_000){
        precio_neto=precio*0.88
    }else if (precio>=100_000){
        precio_neto=precio*0.82
    }
    return precio_neto
}

fun main(){
    print("Ingrese el valor del libro, para saber su precio neto: ")
    var precio = readLine()!!.toDouble()
    println("El precio neto del libro es: ${precio_libro(precio)}")
    while(precio>0){
        print("Ingrese el valor del libro para saber el descuento: ")
        precio = readLine()!!.toDouble()
        println("El precio del libro es: ${precio_libro(precio)}")
    }
}