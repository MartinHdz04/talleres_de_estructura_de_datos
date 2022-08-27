package Taller4

fun main(){
    var municipio = Triple("", 0, "")
    var pobMin = 999999999
    do{
        print("Ingrese el nombre del municipio: ")
        var mun = readln()
        if(mun==""){break}
        print("Ingrese la población de $mun: ")
        var pob = readln().toInt()
        if(pob<=0){break}
        print("Ingrese el departamneto al que pertence $mun: ")
        var dep = readln()
        if(dep==""){break}

        if(pob<pobMin && mun!="" && dep!=""){pobMin=pob; municipio=Triple(mun, pob, dep)}

    }while(pob>=0 || mun!="" || dep!="")

    println("El municipio con mayor población: ${municipio.first}")
    println("Población: ${municipio.second}")
}