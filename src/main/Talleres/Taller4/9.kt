package Taller4

fun main(){
    var perMax = Pair("", 0.0) ; var perMin = Pair("", 99999999.0)
    var mas60=0 ; var men60=0 ; var sum=0.0 ; var cant=0

    print("¿Cuántos estudiantes va a ingresar?: ")
    val est = readln().toInt()

    repeat(est){
        print("Ingrese el nombre del estudiante ${it+1}: ")
        var nombre = readln()
        print("Puntaje de $nombre: ")
        var pun=readln().toDouble()

        if(pun>perMax.second){perMax=Pair(nombre, pun)}
        if(pun<perMin.second){perMin=Pair(nombre, pun)}
        if(pun == 60.0){mas60++}else{men60++}
        sum+=pun ; cant++
    }

    println("Puntaje max: ${perMax}")
    println("Puntaje min: ${if(cant==0){0.0}else{perMin}}")
    println("Puntajes superiores a 60: $mas60")
    println("Puntajes inferiores a 60: $men60")
    println("Promedio de valores: ${if(cant!=0){sum/cant}else{0}}")
}