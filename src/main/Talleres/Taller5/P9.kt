package Taller5

fun distancia(x:Double, y:Double)=Math.sqrt((x*x)+(y*y))

fun cuadrante(x:Double, y:Double):Int{
    if (x>0.0 && y>0.0){
        return 1
    }else if(x<0.0 && y>0.0){
        return(2)
    }else if(x<0.0 && y<0.0){
        return(3)
    }else if(x>0.0 && y<0.0){
        return(4)
    }
    return 0
}fun cal_punto(puntos:MutableList<Pair<Double, Double>>): Triple<Pair<Double, Double>, Double, Int> {
    var dis = distancia(puntos[0].first, puntos[0].second)
    var punto = Pair(puntos[0].first, puntos[0].second)
    var cuad = cuadrante(puntos[0].first, puntos[0].second)
    for ((x,y) in puntos){
        if(distancia(x, y)>dis){
            dis = distancia(x, y)
            punto = Pair(x, y)
            cuad = cuadrante(x, y)
        }
    }
    return Triple(punto, dis, cuad)
}

fun main(){
    var puntos:MutableList<Pair<Double, Double>> = mutableListOf()

    print("Ingrese cuantas coordenadas va a registrar: ")
    val reps = readln().toInt()

    repeat(reps){
        print("Ingrese la coordenada ${it+1} x primero y despues de un espacio la y: ")
        var coordenada = readln()
        var x = coordenada.split(" ")[0].toDouble()
        var y = coordenada.split(" ")[1].toDouble()
        var punto = Pair(x, y)
        puntos.add(punto)
    }
    print("\nPunto: ${cal_punto(puntos).first}\nDistancia: ${cal_punto(puntos).second}\nCuadrante: ${cal_punto(puntos).third}")
}