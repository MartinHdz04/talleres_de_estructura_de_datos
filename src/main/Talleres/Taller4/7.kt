package Taller4

fun main(){
    var p_cons_licor=0 ; var m_men_edad=0 ; var h_no_ag=0 ; var s_cer=0 ; var c_cer=0 ; var c_whi=0 ; var n_enc=0
    do{
        var r2: Int? = 0

        print("Consume licor (Si/No): ")
        var r1 = readln().trim().lowercase()
        if(r1==""){break}

        else if (r1=="si"){
            print("Licor preferido: 1-Aguardiante, 2-Ron, 3-Cerveza, 4-Tequila, 5-Whisky, 6-Otro: ")
            r2 = readLine()?.toIntOrNull()
            if(r2!!<=0 || r2==null){break}
        }

        print("Edad: ")
        var r3 = readln().toInt()
        if(r3<=0 || r3==null){break}

        print("Sexo (Hombre/Mujer): ")
        var r4 = readln().trim().lowercase()
        if(r4==""){break}

        if(r1=="si"){
            p_cons_licor++
        }
        if(r2 != 0 && r2 != 1){
            if (r4=="hombre" && r3 in 20..25){
                h_no_ag++
            }
        }
        if(r4=="mujer" && r3<18){
            m_men_edad++
        }
        if(r2==2){
            s_cer+=r3
            c_cer++
        }
        if(r2==5){
            c_whi++
        }

        print("Para continuar digite enter, para terminar cualquier otra tecla: ")
        var continuar = readln()


    }while(continuar == "")

    println("Personas que consumen licor: $p_cons_licor")
    println("Mujeres menores de edad: $m_men_edad")
    println("Total de hombres que no consumen aguardiente y que tienen entre 20 y 25 años de edad: $h_no_ag")
    println("Promedio de edad de las personas que consumen cerveza: ${if(c_cer!=0){s_cer/c_cer}else{0}} años")
    println("Porcentaje de las personas que consumen whisky: ${if(n_enc!=0){(c_whi/n_enc)*100}else{0}}%")
}