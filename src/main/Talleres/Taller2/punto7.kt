package Taller2

fun dis_coordenadas(abs1:Double, ord1:Double, abs2:Double, ord2:Double)=Math.sqrt(Math.pow((ord2-ord1),2.0)+Math.pow((abs2-abs1), 2.0))
fun pen_coordenadas(abs1:Double, ord1:Double, abs2:Double, ord2:Double)=(ord2-ord1)/(abs2-abs1)
fun punto_medio(abs1:Double, ord1:Double, abs2:Double, ord2:Double):Pair<Double, Double>{
    val pmx=(abs1+abs2)/2
    val pmy = (ord1+ord2)/2
    return Pair(pmx, pmy)
}

fun main(){
    println("Ingrese la coordenada del primer punto (x1, y1): ")
    print("x1: ")
    val abs1 = readLine()!!.toDouble()
    print("y1: ")
    val ord1 = readLine()!!.toDouble()
    println("Ingrese la coordenada del segundo punto (x1, y1): ")
    print("x2: ")
    val abs2 = readLine()!!.toDouble()
    print("y2: ")
    val ord2 = readLine()!!.toDouble()
    println("Distancia de entre ambos puntos: ${dis_coordenadas(abs1, ord1, abs2, ord2)}")
    println("Pendiente de la recta que une ambos puntos: ${pen_coordenadas(abs1, ord1, abs2, ord2)}")
    println("Punto medio: ${punto_medio(abs1, ord1, abs2, ord2)}")
}