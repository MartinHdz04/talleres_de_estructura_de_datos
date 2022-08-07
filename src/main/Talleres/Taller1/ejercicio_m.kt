package Taller1

/*
Entradas
Radio de la base-->Double-->rb
Altura del cono-->Double-->alt
Salidas
Volumen del cono-->Double-->volumen
 */

//función
fun halla_volumen(rb:Double, alt:Double):Double{
    val pi = Math.PI
    val volumen = (pi*(rb*rb)*alt)/3
    return volumen
}