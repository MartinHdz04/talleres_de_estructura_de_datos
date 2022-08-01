package Ejercicio_3
import java.util.Date
import kotlin.time.days

/*
Entradas
Dia de nacimiento-->Int-->dia_n
Mes de nacimiento-->Int-->mes_n
Año de nacimiento-->Int-->anio_n
Dia de registro-->Int-->dia_r
Mes de registro-->Int-->mes_r
Año de registro-->Int-->anio_r
Salidas
Edad (años) del empleado-->Int-->anio_e
Edad (meses) del empleado-->Int-->mes_e
Edad (dias) del empleado-->Int-->dia_e
 */

//función
fun calcula_edad (dia_n:Int, mes_n:Int, anio_n:Int, dia_r:Int, mes_r:Int, anio_r:Int):Triple<Int, Int, Int>{
    var anio_e = anio_r - anio_n
    var mes_e = mes_r - mes_n
    var dia_e = dia_r - dia_n

    println("$anio_e $mes_e $dia_e")
    if ((mes_n>mes_r)){
        anio_e = anio_e - 1
        mes_e = 12 - mes_e
    }
    if (mes_n==mes_r){
        if(dia_n>dia_r){
            anio_e = anio_e - 1
            dia_e = 30 - dia_e
        }
    }
    return Triple(anio_e, mes_e, dia_e)
}

//programa
fun main(){
    println("Ingrese la fecha del registro: Primero el año, seguido de un enter el mes, seguido de un enter el dia")
    var anio_r = readLine()!!.toInt()
    var mes_r = readLine()!!.toInt()
    var dia_r = readLine()!!.toInt()

    println("Ingrese la fecha de nacimiento: Primero el año, seguido de un enter el mes, seguido de un enter el dia")
    var anio_n = readLine()!!.toInt()
    var mes_n = readLine()!!.toInt()
    var dia_n = readLine()!!.toInt()

    val anio_e = calcula_edad(dia_n, mes_n, anio_n, dia_r, mes_r, anio_r).first
    val mes_e = calcula_edad(dia_n, mes_n, anio_n, dia_r, mes_r, anio_r).second
    val dia_e = calcula_edad(dia_n, mes_n, anio_n, dia_r, mes_r, anio_r).third
    println("La edad es $anio_e años, $mes_e meses, $dia_e dias")
}