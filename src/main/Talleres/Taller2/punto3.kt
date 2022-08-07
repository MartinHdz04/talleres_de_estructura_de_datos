package Taller2

/*
Entradas
Altura de la escalera(metros)-->Double-->x
Ángulo de la escalera(grados)-->Double-->a
Salidas
Longitud de la escalera-->Doble-->y
 */

//función
fun lon_escalera (x:Double, a:Double):Double{
    val y = x/(Math.sin(a))
    return y
}

//programa
fun main(){
    print("Digite el valor del ángulo de la escalera en grados: ")
    val a = readLine()!!.toDouble()
    print("Digite el valor de la altura de la escalera en metros: ")
    val x = readLine()!!.toDouble()
    print("La longitud de la escalera es: ${lon_escalera(x, a)} metros")
}
