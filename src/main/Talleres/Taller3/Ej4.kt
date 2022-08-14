package Taller3

fun paga_semanal(horas:Float)=when{
    horas in 0.0..34.9 -> 15_000*horas
    horas in 35.0..59.9 -> (15_000*35)+(18_000*(horas-35.0))
    horas > 60 -> (15_000*35)+(18_000*25)+(25_000*(horas-60.0))
    else->0.0
}

fun main(){
    print("¿De cuántos trabajadores desea saber la paga?: ")
    val trabajadores= readLine()!!.toInt()
    repeat(trabajadores){
        var horas:Float = 0.0F
        print("Horas trabajadas del trabajador ${it+1}: ")
        horas = readLine()!!.toFloat()
        println("Pago: ${paga_semanal(horas)}")
    }
}