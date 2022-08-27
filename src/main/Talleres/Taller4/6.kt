package Taller4

fun IMC (m:Float, h:Float)=m/(h*h)

fun main(){
    var per = Pair("", 0F)
    var masa = 0F ; var altura = 0F

    print("¿Cuántas perosnas hay en la empresa?: ")
    val emp = readln().toInt()

    repeat(emp){
        print("Nombre del empleado ${it+1}: ")
        var nombre = readln()
        print("Ingrese la altura (metros) de $nombre: ")
        var h = readln().toFloat()
        print("Ingrese el peso (Kg) de $nombre: ")
        var m = readln().toFloat()
        var imc = IMC(m, h)
        println("IMC de $nombre: ${imc}")

        if(imc>per.second){per=Pair(nombre, imc) ; altura=h ; masa=m}
    }

    println("Nombre: " + per.first)
    println("Peso: " + masa)
    println("Altura: " + altura)
}