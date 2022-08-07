package Taller2

/*
Entradas
Base del rectángulo-->Double-->br
Altura del rectángulo-->Double-->altr
Salidas
Perímetro del rectángulo-->Double-->perr
Area del rectángulo-->Double-->ar
 */

//función
fun rectangulo(br:Double, altr:Double):Pair<Double, Double>{
    val perr = 2*br + 2*altr
    val ar = br*altr
    return Pair(perr, altr)
}

/*
Entradas
Base del triángulo-->Double-->bt
Altura del triángulo-->Double-->altt
Salidas
Perímetro del triángulo-->Double-->pert
Area del triángulo-->Double-->at
 */

//función
fun triangulo(bt:Double, altt:Double):Pair<Double, Double>{
    val pert = bt+altt+(Math.sqrt((Math.pow(bt,2.0))+(Math.pow(altt, 2.0))))
    val at = (bt*altt)/2
    return Pair(pert, at)
}

/*
Entradas
Perímetro del rectángulo-->Double-->perr
Area del rectángulo-->Double-->ar
Perímetro del triángulo-->Double-->pert
Area del triángulo-->Double-->at
Salidas
Perímetro del terreno-->Double-terrenop
Area del terreno-->Double-->terrenoa
 */

//función
fun terreno(perr:Double, ar:Double, pert:Double, at:Double):Pair<Double, Double>{
    val terrenop = perr + pert
    val terrenoa = ar + at
    return Pair(terrenop, terrenoa)
}

//programa
fun main(){
    print("Ancho del terreno: ")
    val br = readLine()!!.toDouble()
    val bt = br
    print("Largo más corto del terreno: ")
    val altr = readLine()!!.toDouble()
    print("Largo más grande del terreno: ")
    val largo = readLine()!!.toDouble()
    val altt = largo-altr
    val perr = rectangulo(br, altr).first
    val ar = rectangulo(br, altr).second
    val pert = triangulo(bt, altt).first
    val at = triangulo(bt, altt).second
    println("Perímetro del terreno: ${terreno(perr, ar, pert, at).first}")
    println("Area del terreno: ${terreno(perr, ar, pert, at).second}")
}