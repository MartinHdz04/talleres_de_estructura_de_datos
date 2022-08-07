package Taller2

/*
Entradas
Radio círculo-->Double-->r
Salidas
Area del círculo-->Double
 */

//función
fun area_circulo (r:Double)=Math.PI*r*r

/*
Entradas
Area mayor-->Double-->amayor
Area menor-->Double-->amenor
Salidas
Area de la corona-->Double
 */

//función
fun corona(amayor:Double, amenor:Double)=amayor-amenor

//programa
fun main(){
    print("Ingrese el radio mayor: ")
    val rmayor = readLine()!!.toDouble()
    val amayor = area_circulo(rmayor)
    print("Ingrese el radio menor: ")
    val rmenor = readLine()!!.toDouble()
    val amenor = area_circulo(rmenor)
    print("El area de la corona es: ${corona(amayor, amenor)}")
}