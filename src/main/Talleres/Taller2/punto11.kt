package Taller2

fun descomponer (numero:Int):Pair<Int, Int>{
    val decenas = (Math.floor(numero/10.0)).toInt()
    val unidades = (Math.floorMod(numero, 10))
    return Pair(decenas, unidades)
}

fun und_romano(unidad:Int)=when(unidad){
    0->""
    1->"I"
    2->"II"
    3->"III"
    4->"IV"
    5->"V"
    6->"VI"
    7->"VII"
    8->"VIII"
    9->"IX"
    else->null
}

fun dec_romano(decena:Int)=when(decena){
    0->""
    1->"X"
    2->"XX"
    3->"XXX"
    4->"XL"
    5->"L"
    6->"LX"
    7->"LXX"
    8->"LXXX"
    9->"XC"
    else->null
}

fun main(){
    print("Ingrese un número entero entre 0 a 99: "); val numero = readLine()!!.toInt()
    if (numero>=0 && numero<=99){
        val decenas = descomponer(numero).first
        val unidades = descomponer(numero).second
        val unidadr = und_romano(unidades)
        val decenar = dec_romano(decenas)
        print("El número en romano es: ${decenar+unidadr}")
    }else{
        print("Valor no admitido")
    }
}