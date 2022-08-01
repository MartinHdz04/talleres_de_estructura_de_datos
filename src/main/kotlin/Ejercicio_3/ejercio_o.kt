package Ejercicio_3

/*
Entradas
Cantidad de personas-->Int-->personas
Cantidad de veces al año que cambian la bateria-->Int-->usos
Salidas
Litros de agua contaminados-->Double-->lt_contaminados
 */

//función
fun calcula_contaminacion (personas:Int, usos:Int):Long{
    val indice_cont = 175
    val baterias = personas*usos
    val lt_contaminados = baterias*indice_cont
    return lt_contaminados.toLong()
}

