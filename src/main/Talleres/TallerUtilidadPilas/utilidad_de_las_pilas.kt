package TallerUtilidadPilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Pilas
 * Autor: Universidad EAN - Marzo 18, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*

/**
 * Objeto que permite convertir una expresión infija normal a una expresión en notación
 * postfija. Utiliza pilas para realizar la conversión.
 */
object Evaluador {

    //-------------------------------------
    // Métodos
    //-------------------------------------

    /**
     * Verifica que la expresión tiene los símbolos de agrupación bien balanceados
     * @return true si la expresión está balanceados
     */
    fun estánSímbolosAgrupaciónBalanceados(expresion: IList<String>): Boolean {
        val pilaSimbolos: IStack<String> = TLinkedStack()
        for (n in expresion){
            if(n=="(" || n=="[" || n=="{"){
                pilaSimbolos.push(n)
            }else if (n==")" || n=="]"  || n=="}"){
                if(pilaSimbolos.isEmpty){
                    return false
                }
                var ult = pilaSimbolos.peek()
                pilaSimbolos.pop()
                if(!(ult=="(" && n==")" || ult=="[" && n=="]" || ult=="{" && n=="}")){
                    return false
                }
            }
        }
        return pilaSimbolos.isEmpty
    }

    /**
     * Transforma la expresión, cambiando los simbolos de agrupación [] y {} por ()
     */
    fun reemplazarDelimitadoresPorParéntesis(expresion: IList<String>): Unit {
        var copia:IList<String> = TLinkedList()
        for (n in expresion){
            if(n=="[" || n=="{"){
                copia.add("(")
                continue
            }
            else if (n=="]" || n=="}"){
                copia.add(")")
                continue
            }
            copia.add(n)
        }
        expresion.clear()
        for(n in copia){
            expresion.add(n)
        }
    }

    /**
     * Realiza la conversión de la notación infija a postfija
     * @return la expresión convertida a postfija
     */
    fun convertirAPostfijo(expresion: IList<String>): IList<String> {
        val pila: IStack<String> = TLinkedStack()
        val lista: IList<String> = TList() //((40 + 30) - 25)
        for (n in expresion){
            if(n=="+" || n=="-" || n=="*" || n=="/" || n=="%"){pila.push(n); continue}
            else if(n=="("){continue}
            else if(n==")"){lista.add(pila.peek()); pila.pop(); continue}
            lista.add(n)
        }
        return lista
    }

    /**
     * Realiza la evaluación de la expresión postfija almacenada en la lista
     * llamada "expresión". Realiza las operaciones de acuerdo al algoritmo
     * presentado.
     */
    fun evaluarExpresiónPostfija(expression: IList<String>): Int {
        val pila: IStack<Int> = TLinkedStack()
        for(n in expression){
            if(n=="0" || n=="1" || n=="2" || n=="3" || n=="4" || n=="5" || n=="6" || n=="7" || n=="8" || n=="9") {
                pila.push(n.toInt());continue
            }
            var a = pila.peek(); pila.pop()
            var b = pila.peek(); pila.pop()
            when(n){
                "+"->pila.push((b+a).toInt())
                "-"->pila.push((b-a).toInt())
                "*"->pila.push((b*a).toInt())
                "/"->pila.push((b/a).toInt())
                "%"->pila.push((b%a).toInt())
            }
        }
        return pila.peek()
    }
}
