package Taller2

fun dia_despues(dia:String):String{
    val dia_despues = when(dia.trim().lowercase()){
    "lunes"->"Martes"
    "martes"->"Miércoles"
    "miercoles"->"Jueves"
    "jueves"->"Viernes"
    "viernes"->"Sábado"
    "sabado"->"Domingo"
    "domingo"->"Lunes"
    else->"No es un dia de la semana"
}
   return dia_despues
}

fun main(){
    print("Ingrese un dia de la semana: "); val dia= readLine()!!
    println(dia_despues(dia))
}