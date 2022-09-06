package ean.estructuradedatos.tallerpilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto Taller de Pilas
 * Autor: Universidad EAN - Marzo 11, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Ejercicio 01
 * Obtener el fondo de la pila
 */
fun <T> IStack<T>.bottom(): T { //Esta función es O(N)
    var pila = this.copy() //O(1)
    var ult = pila.peek() //O(1)
    while(!pila.isEmpty){ //O(N)
        ult = pila.peek() //O(1)
        pila.pop() //O(1)
    }
    return ult //O(1)
}

/**
 * Ejercicio 02
 * Función para sumar los números pares de tres cifras que hay en una pila de enteros
 */
fun sumarParesTresCifras(pila: IStack<Int>): Int { // esta función es O(N)
    var pila = pila.copy() //O(N)
    var ult = pila.peek() // O(N)
    var suma=0 // O(1)
    while(!pila.isEmpty){// O(N)
        ult= pila.peek() // O(1)
        if(ult in 100 .. 999 && ult%2 == 0){
            suma+=ult //peor caso: o(1)
        }
        pila.pop() //O(1)
    }
    return suma //O(1)
}

/**
 * Ejercicio 03
 * Función para determinar cuál es el número más grande de dos cifras que hay
 * en una pila de números. Si no existe ningún número de dos cifras, retorne
 * null
 */
fun mayorDeDosCifras(pila: IStack<Int>): Int? { //Esta función es O(N)
    var pila = pila.copy() ; var mayor:Int? = null ; var ult = pila.peek()

    while(!pila.isEmpty){ //O(N)
        ult = pila.peek()
        if(ult in 10..99){ //O(N)
            if(mayor==null){mayor=0} //O(1)
            if(ult>mayor!!){mayor = ult} //O(1)
        }
        pila.pop()
    }
    return mayor
}

/**
 * Ejercicio 04
 * Hacer una función externa que permita guardar un elemento en el fondo
 * de la pila. GEnérica
 */
fun <T> guardarEnElFondo(p: IStack<T>, elem: T): Unit { //Esta función es O(N)
    var pila= p ; var ult = pila.peek()
    var almacen:MutableList<T> = mutableListOf() //O(1)
    while(!pila.isEmpty){ //O(N)
        ult=pila.peek()
        almacen.add(ult)
        pila.pop()
    }
    pila.push(elem)
    while(!almacen.isEmpty()){//O(N)
        pila.push(almacen.last())
        almacen.removeLast()
    }
}

/**
 * Ejercicio 05
 * Función genérica para obtener el tamaño de una pila
 */
fun <T> tamPila(p: IStack<T>) : Int { //Esta función es O(N)
    var pila = p.copy() ; var cont = 0

    while(!pila.isEmpty){//O(N)
        cont++
        pila.pop()
    }
    return cont
}

/**
 * Ejercicio 06
 * Función genérica que permite Invertir una pila en otra. Recibe la pila y retorna la pila, pero invertida.
 * Solo puede usarse las operaciones de las pilas, no listas.
 */
fun <T> invertirPila(pila: IStack<T>): IStack<T> { //Esta función es O(N)
    var pila1 = pila.copy() ; var ult = pila1.peek()
    var pila2: IStack<T> = TLinkedStack()
    while(!pila1.isEmpty){ //O(N)
        ult=pila1.peek()
        pila2.push(ult)
        pila1.pop()
    }
    return pila2
}


/**
 * Ejercicio 07
 * Función genérica que copia una pila en otra.
 * La función recibe la pila y retorna la copia.
 * No debe usarse el método copy de la pila ni listas
 */
fun <T> copiarPila(pila: IStack<T>): IStack<T> { //Esta función es O(N)
    var pila1 = invertirPila(pila) ; var ult = pila1.peek()
    var pila2: IStack<T> = TLinkedStack()

    while(!pila1.isEmpty){ //O(N)
        ult = pila1.peek()
        pila2.push(ult)
        pila1.pop()
    }
    return pila2
}


/**
 * Ejercicio 08
 * Función genérica que recibe una pila y un elemento y que elimina de la
 * pila todas las ocurrencias del elemento que se recibe como parámetro.
 * No debe retornar nada.
 */
fun <T> eliminarElementoPila(pila: IStack<T>, elem: T) { //Esta función es O(N)
    var pila1 = pila.copy() ; var ult=pila1.peek()
    var pila2:IStack<T> = TLinkedStack()
    while(!pila1.isEmpty){ //O(N)
        ult=pila1.peek()
        if(ult!=elem){
            pila2.push(ult)//O(1)
        }
        pila1.pop()
    }
    pila.clear()
    while(!pila2.isEmpty){ //O(N)
        ult=pila2.peek()
        pila.push(ult)
        pila2.pop()
    }
}

/**
 * Ejercicio 09
 * Invertir una lista de números utilizando una pila. La función no retorna,
 * debe modificar la lista
 */
fun <T> invertirLista(list: IList<T>) {//Esta función es O(N)
    var pila: IStack<T> = TLinkedStack()
    while(!list.isEmpty){//O(N)
        pila.push(list.last)
        list.removeLast()
    }
    pila= invertirPila(pila) //O(1), no estoy seguro, porque esa función depende del tamaño de la pila,PERO es una asignación
    while(!pila.isEmpty){ // O(N)
        var ult=pila.peek()
        list.add(ult)
        pila.pop()
    }
}


/**
 * Ejercicio 10
 * Usar una pila de letras para Determinar si una frase es palindrome o no
 */
fun palindrome(frase: String): Boolean { //Esta función es O(N)
    var conf = false
    var pila:IStack<Char> = TLinkedStack()
    var mensaje=""

    for(letra in frase){pila.push(letra)}//O(N)

    while(!pila.isEmpty){ //O(N)
        var ult=pila.peek()
        mensaje+=ult
        pila.pop()
    }

    if(mensaje==frase){conf = true}//O(1)
    return conf
}

/**
 * Ejercicio 11
 * Determinar si dos pilas son iguales
 */
fun <T> igualesPilas(pila1: IStack<T>, pila2: IStack<T>): Boolean { //Esta función es O(N)
    var conf = false
    var copia1=pila1.copy() ; var copia2=pila2.copy()

    var lista1:MutableList<T> = mutableListOf()
    var lista2:MutableList<T> = mutableListOf()
    while(!copia1.isEmpty){//O(N)
        lista1.add(copia1.peek())
        copia1.pop()
    }
    while(!copia2.isEmpty){//O(N)
        lista2.add(copia2.peek())
        copia2.pop()
    }
    if(lista1 == lista2){ //O(1)
        conf=true
    }
    return conf
}

class ProbarPila {
    @Test
    fun pruebaEjercicio01() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        println("La pila es $pila")
        println("El tope es ${pila.peek()}")
        println("El fondo es ${pila.bottom()}")

        assertEquals(1, pila.bottom())
    }

    @Test
    fun pruebaEjercicio02() {
        val p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(2500)
        p.push(100)
        p.push(125)
        p.push(81)

        assertEquals(350, sumarParesTresCifras(p))
    }

    @Test
    fun pruebaEjercicio03() {
        var p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(50)
        p.push(100)
        p.push(95)
        p.push(81)

        assertEquals(mayorDeDosCifras(p), 95)

        p.clear()
        p.push(3)
        p.push(4)
        p.push(5)

        assertNull(mayorDeDosCifras(p))

   }

    @Test
    fun pruebaEjercicio04() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        assertEquals(1, pila.bottom())

        guardarEnElFondo(pila, 10)

        assertEquals(10, pila.bottom())
        println("Prueba superada!")
    }


    @Test
    fun pruebaEjercicio05() {
        var pila: IStack<String> = TLinkedStack()

        assertEquals(0, tamPila(pila))

        pila.push("Hola")
        pila.push("nano")
        pila.push("shell")
        pila.push("rojo")


        assertEquals(4, tamPila(pila))
    }

    @Test
    fun pruebaEjercicio06() {
        val pila: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila.push(elem)
        }

        val inv = invertirPila(pila)
        for (elem in lista) {
            assertEquals(elem, inv.peek())
            inv.pop()
        }
    }

    @Test
    fun pruebaEjercicio07() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = TList(5, 11, 8, -3, 6, 4, 31)

        for (elem in lista) {
            pila.push(elem)
        }

        val copia = copiarPila(pila)
        for (n in lista.size - 1 downTo 0) {
            assertEquals(lista[n], copia.peek())
            copia.pop()
        }
    }

    @Test
    fun pruebaEjercicio08() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = TList(5, 11, 8, -3, 5, 4, 31, 5)

        for (elem in lista) {
            pila.push(elem)
        }

        eliminarElementoPila(pila, 5)

        for (n in lista.size - 1 downTo 0) {
            if (lista[n] != 5) {
                assertEquals(lista[n], pila.peek())
                pila.pop()
            }
        }
        assertTrue { pila.isEmpty }
    }

    @Test
    fun pruebaEjercicio09() {
        val lista = TList(8, 1, 7, 6, -4, 5, 1, 31)
        val invlst = lista.copy()

        invertirLista(lista)

        for (i in 0 until lista.size) {
            assertEquals(lista[i], invlst[lista.size - i - 1])
        }

    }

    @Test
    fun pruebaEjercicio10() {
        assertTrue { palindrome("nosubasabuson") }
        assertTrue { palindrome("lavanesabasenaval") }
        assertTrue { palindrome("logracasillasallisacargol") }
        assertFalse { palindrome("arrozconleche") }
    }

    @Test
    fun pruebaEjercicio11() {
        val pila1: IStack<String> = TLinkedStack()
        val pila2: IStack<String> = TLinkedStack()
        val pila3: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila1.push(elem)
            pila2.push(elem)
            pila3.push(elem)
            pila3.push(elem)
        }

        assertTrue(igualesPilas(pila1, pila2))
        assertFalse(igualesPilas(pila3, pila2))
    }


}