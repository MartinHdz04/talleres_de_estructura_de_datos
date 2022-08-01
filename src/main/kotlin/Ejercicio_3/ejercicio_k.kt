package Ejercicio_3
import kotlin.collections.HashMap

/*
Entradas
Edades-->Array<Int>-->edades
Nombres-->Array<String>-->nombres
Salidas
Nombre del menor-->String-->nombre_menor
Edad del menor-->Int-->edad_menor
*/

//función
fun calculo_menor(edades:Array<Int>, nombres:Array<String>):Pair<String, Int>{
    val nombre1 = nombres[0]
    val nombre2 = nombres[1]
    val nombre3 = nombres[2]

    val edad1 = edades[0]
    val edad2 = edades[1]
    val edad3 = edades[2]

    if((edad1>edad2)&&(edad1>edad3)){
        return Pair(nombre1, edad1)
    }
    else if((edad2>edad1)&&(edad2>edad3)){
        return Pair(nombre2, edad2)
    }
    else if((edad3>edad1)&&(edad3>edad2)){
        return Pair(nombre3, edad3)
    }else{
        return Pair("",0)
    }
}

//programa
fun main(){
    println("Ingrese los nombres de las tres personas seguido de un enter")
    val nombre1 = readLine()!!.toString()
    val nombre2 = readLine()!!.toString()
    val nombre3 = readLine()!!.toString()

    val nombres = arrayOf(nombre1, nombre2, nombre3)

    println("Ingrese las edades de las tres personas seguido de un enter en el orden que uso anteriormente")
    val edad1 = readLine()!!.toInt()
    val edad2 = readLine()!!.toInt()
    val edad3 = readLine()!!.toInt()

    val edades = arrayOf(edad1, edad2, edad3)

    println("El menor es: ${calculo_menor(edades, nombres).first}")
    println("Con: ${calculo_menor(edades, nombres).second} años")
}