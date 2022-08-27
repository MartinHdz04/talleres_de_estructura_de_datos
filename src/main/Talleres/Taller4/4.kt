package Taller4

fun dis_ciudades (h:Double, l:Double)=(h*h)+(l*l)

fun main(){
    var ciudad=Pair("", 0.0)
    do{
        print("Ingrese el nombre la ciudad")
        var nombre = readln()
        print("Ingrese la latitud: ")
        var l = readln().toDouble()
        print("Ingrese la altitud: ")
        var h = readln().toDouble()
        var dis = dis_ciudades(h, l)

        if(dis>ciudad.second){ciudad = Pair(nombre, dis)}

        print("Para continuar digite enter, para terminar cualquier otra tecla: ")
        var continuar = readln()
    }while(continuar == "")
    print("La ciudad mas lejana de bogotá es ${ciudad.first} a ${ciudad.second} de distancia")
}