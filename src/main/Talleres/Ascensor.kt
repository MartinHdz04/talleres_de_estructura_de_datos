package Taller6

class Ascensor{
    private var n_pisos:Int = 0
    private var n_sotanos:Int = 0
    private var piso_actual = 1

    constructor()
    constructor(n_pisos: Int, n_sotanos: Int, piso_actual: Int) {
        this.n_pisos = n_pisos
        this.n_sotanos = n_sotanos
        this.piso_actual = piso_actual
    }

    fun getN_pisos():Int{
        return this.n_pisos
    }
    fun getN_sotanos():Int{
        return this.n_sotanos
    }
    fun getPiso_actual():Int{
        return this.piso_actual
    }

    fun setN_pisos(n_pisos:Int){
        this.n_pisos = n_pisos
    }
    fun setN_sotanos(n_sotanos: Int){
        this.n_sotanos = n_sotanos
    }
    fun setPiso_actual(piso_actual: Int){
        this.piso_actual = piso_actual
    }

    fun sigArr(){
        if(this.piso_actual <this.n_pisos){
            this.piso_actual+=1
            if(this.piso_actual==0){
                this.piso_actual+=1
            }
            println("Subiendo.....")
            println("Piso actual: ${piso_actual}")
        }
    }

    fun sigAbj(){

        if(this.piso_actual>-1*this.n_sotanos){
            this.piso_actual-=1
            if(this.piso_actual==0){
                this.piso_actual-=1
            }
            println("Bajando.....")
            println("Piso actual: ${piso_actual}")
        }
    }


}

fun main(){
    print("Ingrese la cantidad de pisos, seguido de un enter la cantidad de sotanos del edificio")
    val n_pisos = readln().toInt()
    val n_sotanos = readln().toInt()
    print("Piso actual: ")
    val piso_actual = readln().toInt()
    var ascensor = Ascensor(n_pisos, n_sotanos, piso_actual)

    do{
        print("1.Subir  2.Bajar  3.Salir")
        var opcion = readln().toInt()
    }while(opcion != 3)
}