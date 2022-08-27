package Taller4

fun p_equipo(ganados: Short, empatados:Short)=(ganados*3)+empatados

fun main(){
    var equipo = Pair("", 0)

    print("Ingrese el número de equipos de la liga: ")
    val n_equ = readln().toInt()

    repeat(n_equ){
        print("Ingrese el nombre del equipo ${it+1}: ")
        var nombre = readln()
        print("Ingrese los partidos ganados de $nombre: ")
        var ganados = readln().toShort()
        print("Ingrese los partidos empatados de $nombre: ")
        var empatados = readln().toShort()

        var puntos = p_equipo(ganados, empatados)

        if(puntos>equipo.second){
            equipo = Pair(nombre, puntos)
        }
    }
    print("Campeón: ${equipo.first} con ${equipo.second} puntos")
}