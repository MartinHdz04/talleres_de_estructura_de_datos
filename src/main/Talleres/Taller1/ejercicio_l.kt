package Taller1

/*
Entradas
Edad alumno-->Int-->edad
Promedio del alumno-->Double-->promedio
Salidas
Valor de la beca-->Double-->beca
*/

//función
fun asigna_beca(edad:Int, promedio:Double): Double {
    var beca = 0.0
    if(edad>18){
      if(promedio>=90.0){beca= 2000.0}
      else if(promedio>=75.0){beca = 1000.0}
      else if(promedio>=60.0){beca = 500.0}
      else if(promedio<60.0){println("Estudia más...")}
    }
    if(edad<=18){
        if(promedio>=90.0){beca = 3000.0 }
        else if(promedio>=80.0){beca = 2000.0 }
        else if(promedio>=60){beca = 100.0 }
        else if(promedio<60.0){println("Estudia más...")}
    }
    return beca
}

//programa
fun main(){
    println("Ingrese su edad:")
    val edad = readLine()!!.toInt()
    println("Ingrese su promedio:")
    val promedio = readLine()!!.toDouble()
    println("Su beca es de ${asigna_beca(edad, promedio)}")
}