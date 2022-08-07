package Taller1

/*
Entradas
Capital inicial-->Double-->c
Tasa de interés-->Double--t
Tiempo-->Double-->n
Salidas
Valor presente-->Double-->vp
 */

//función
fun valor_presente(c:Double, t:Double, n:Double):Double{
    val vp = c/(Math.pow((1+t),n))
    return vp
}
