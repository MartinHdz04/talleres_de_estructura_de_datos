package Taller6

import kotlin.math.PI
import kotlin.math.sqrt

class Pendulo{
    private var l:Double = 0.0
    private var a:Double = 0.0

    constructor()
    constructor(l:Double, a:Double){
        this.l=l
        this.a=a
    }

    fun getL():Double{
        return this.l
    }
    fun getA():Double{
        return this.a
    }

    fun setL(l:Double){
        this.l=l
    }
    fun setA(a:Double){
        this.a=a
    }

    fun periodo():Double{
        return ((2*PI)*(sqrt(this.a/this.l)))
    }
}

data class Pendulo2(
    var l:Double = 0.0,
    var a:Double = 0.0
){
    fun periodo():Double{
        return ((2*PI)*(sqrt(this.a/this.l)))
    }
}

fun main(){
    var x = Pendulo()
    var op = 0
    do{
        println("0.Salir\n1.Crear péndulo\n2.imprimir\n3.Periodo de oscilación")
        print("Opción: ")
        op=readln().toInt()
        when(op){
            1->{
                print("Longitud: ")
                val l = readln().toDouble()
                print("Aceleración: ")
                val a = readln().toDouble()
                x.setL(l);x.setA(a)
            }
            2->{
                println("La longitud es de ${x.getL()} y la aceleración es de ${x.getA()}")
            }
            3->{
                println("El periodo de acelearación: ${x.periodo()}")
            }
        }
    }while(op!=0)
}