package Taller3

import kotlin.Array as Array

fun empleado(nombre:String, ventas: Array<Double>, salario:Double):Triple<String, Double, Double>{
    var total_ventas=0.0
    var comision=0.0
    for (i in ventas){
        total_ventas = total_ventas+i
    }
    if (total_ventas>50_000){
        comision = total_ventas*0.15
    }
    return Triple(nombre, (salario + comision), comision)
}
 fun main(){
     var seguir = 1.0

     do{
         var index = 0

         var ventas = arrayOf(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0)
         print("Ingrese el nombre del empleado: ")
         var nombre = readLine()!!
         print("Ingrese el salario de $nombre: ")
         var salario = readLine()!!.toDouble()

         var continuar = "s"
         do{
             print("Ingrese el valor de la venta: ")
             var venta = readLine()!!.toDouble()
             ventas.set(index, venta)
             index = index + 1
             print("¿Desea ingresar otra venta? (s/n): ")
             var continuar = readLine()!!.lowercase().trim()
         }while(continuar=="s")

         val empleado = empleado(nombre, ventas, salario)
         println("nombre: ${empleado.first}");println("Salario Neto: ${empleado.second}");println("Comisión: ${empleado.third}")
         print("Desea seguir con otro empleado (s/n): ")
         continuar = readLine()!!
         if(continuar=="s"){continue}
         else{seguir=0.0}
     }while (seguir>0)
 }