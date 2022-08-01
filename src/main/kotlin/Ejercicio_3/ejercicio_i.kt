package Ejercicio_3

/*
Entradas
Precio del artículo-->Double-->precio
Salidas
Valor con descuento-->Double-->val_des
Valor final-->Double-->val_final
 */

//función
fun valor_objeto(precio:Double):Pair<Double, Double>{
    val descuento = 0.05
    val iva = 0.19
    val val_des = precio-(precio*descuento)
    val val_final = val_des+(val_des*iva)
    return Pair(val_des, val_final)
}

//programa
fun main(){
    println("Ingrese el precio del producto:")
    val precio = readLine()!!.toDouble()
    println("El precio del producto con descuento: ${valor_objeto(precio).first}")
    println("El total a pagar: ${valor_objeto(precio).second}")
}