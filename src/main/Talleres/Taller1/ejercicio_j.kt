package Taller1

/*
Entradas
Nota primer exámen-->Float-->n1
Nota segundo exámen-->Float-->n2
Nota tercer exámen-->Float-->n3
Salidas
Calificación final-->Float-->calificacion
 */

//función
fun calculo_nota(n1:Float, n2:Float, n3:Float):Float{
    val n1 = n1*0.25
    val n2 = n2*0.25
    val n3 = n3*0.5
    val calificacion = n1 + n2 +n3
    return calificacion.toFloat()
}

//programa
fun main(){
    println("Ingrese la primera nota, seguido de un enter la segunda y seguido de un enter la tercera")
    val n1 = readLine()!!.toFloat()
    val n2 = readLine()!!.toFloat()
    val n3 = readLine()!!.toFloat()
    println("Su calificación es: ${calculo_nota(n1, n2, n3)}")
}