package Taller9

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Colas
 * Autor: Universidad EAN - Marzo 18, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/* Función que recibes una cola de palabras y
   que retorne la palabra más larga de la cola.
   La cola original no debe verse modificada. Usa una copia.
 */
fun palabraMasLarga(colaPals: IQueue<String>): String { //Esta función es O(N)
    var copia = colaPals.copy() //O(1)
    var pal = "" // O(1)
    while(!copia.isEmpty){ //O(N)
        var prim = copia.front //O(1)
        if(prim.length > pal.length){pal=prim} //O(1)
        copia.dequeue() //O(1)
    }
    return pal // O(1)
}

/*
Escriba una función genérica que determine el tamaño de una cola.
La cola original no debe verse modificada.
*/
fun <T> tamCola(cola: IQueue<T>): Int { // Esta función es O(N)
    var copia = cola.copy() //O(1)
    var cont = 0 //O(1)

    while(!copia.isEmpty){ //O(N)
        cont++ //O(1)
        copia.dequeue() //O(1)
    }
    return cont //O(1)
}

/*
Función genérica que recibe un elemento y una cola y que
retorna true si el elemento está en la cola y false sino
se encuentra el elemento en la cola. La cola original no
debe verse modificada.
 */
fun <T> existeElemento(col: IQueue<T>, elem: T): Boolean { // Esta función es O(N)
    var copia = col.copy()  //O(1)
    var conf=false //O(1)

    while(!copia.isEmpty){ //O(N)
        var prim = copia.front //O(1)
        if(prim==elem){conf=true} //O(1)
        copia.dequeue() //O(1)
    }
    return conf ////O(1)
}

/*
Función genérica para determinar si dos colas son iguales.
Ninguna de las dos colas deben verse modificadas.
 */
fun <T> igualesColas(col1: IQueue<T>, col2: IQueue<T>): Boolean { // Esta funcion es O(N)
    var c1 = col1.copy() ; var c2 = col2.copy() //O(1) ___ //O(1)
    var conf = false //O(1)
    var cont = 0 //O(1)
    if (tamCola(c1)== tamCola(c2)) { // O(1)
        while (!c1.isEmpty) { //O(N)
            var c1prim = c1.front //O(1)
            var c2prim = c2.front //O(1)
            if (c1prim == c2prim) { //O(1)
                cont++ //O(1)
            }
            c1.dequeue() //O(1)
            c2.dequeue() //O(1)
        }
    }
    if(cont== tamCola(col1)){conf = true} //O(1)
    return conf //O(1)
}

/*
Función genérica que invierte los elementos de la cola.
Debe modificar la cola. Puede usar una pila.
 */
fun <T> invertirCola(col: IQueue<T>) { // Esta función es O(N)
    var pila:IStack<T> = TLinkedStack() //O(1)
    while(!col.isEmpty){ //O(N)
        var prim = col.front
        pila.push(prim) //O(1)
        col.dequeue() //O(1)
    }

    while(!pila.isEmpty){ //O(N)
        var ult = pila.peek()
        col.enqueue(ult) //O(1)
        pila.pop() //O(1)
    }
}

/*
Función genérica que saque el último elemento de una cola,
sin modificar la cola original
 */
fun<T> ultimo (col:IQueue<T>):T{ // Esta función es O(N)
    var reps = tamCola(col) //O(1)
    var copia=col.copy() //O(1)
    repeat(reps-1){ //O(N)
        copia.dequeue() //O(1)
    }
    return copia.front //O(1)
}

//--------------------------------------------------------------------
// Pruebas de las funciones anteriores
//--------------------------------------------------------------------
class Pruebas {
    @Test
    fun prueba1() {
        val cola: IQueue<String> = TLinkedQueue()

        cola.enqueue("hola")
        cola.enqueue("carro")
        cola.enqueue("internacionalizacion")
        cola.enqueue("relojito")
        cola.enqueue("ana")
        cola.enqueue("vericueto")
        cola.enqueue("rosales")

        assertEquals("internacionalizacion", palabraMasLarga(cola))
        println("Prueba superada ☺")
    }

    @Test
    fun prueba2() {
        val cola: IQueue<Double> = TLinkedQueue()

        cola.enqueue(4.5)
        cola.enqueue(-1.17)
        cola.enqueue(10.87)
        cola.enqueue(100.1)
        cola.enqueue(451.811)

        assertEquals(5, tamCola(cola))
        println("Prueba superada ☺")
    }

    @Test
    fun prueba3() {
        val c: IQueue<Char> = TLinkedQueue()

        c.enqueue('x')
        c.enqueue('d')
        c.enqueue('a')
        c.enqueue('f')
        c.enqueue('c')
        c.enqueue('3')
        c.enqueue('#')
        c.enqueue('=')
        c.enqueue('¿')
        c.enqueue('«')
        c.enqueue('y')

        assertTrue {
            existeElemento(c, '#')
        }

        assertFalse {
            existeElemento(c, '?')
        }

        println("Prueba superada ☺")
    }

    @Test
    fun prueba4() {
        var cola1: IQueue<Int> = TLinkedQueue()
        var cola2: IQueue<Int>

        cola1.enqueue(4)
        cola1.enqueue(71)
        cola1.enqueue(27)
        cola1.enqueue(-34171)
        cola1.enqueue(181)

        cola2 = cola1.copy()

        assertTrue(igualesColas(cola1, cola2))

        cola2.enqueue(36)
        cola2.enqueue(23)

        assertFalse(igualesColas(cola2, cola1))

        println("Prueba superada ☺")
    }

    @Test
    fun prueba5() {
        var c1: IQueue<Char> = TLinkedQueue()
        var c2: IQueue<Char> = TLinkedQueue()

        c1.enqueue('x')
        c1.enqueue('y')
        c1.enqueue('z')
        c1.enqueue('w')

        c2.enqueue('w')
        c2.enqueue('z')
        c2.enqueue('y')
        c2.enqueue('x')

        assertFalse {igualesColas(c1, c2)}

        invertirCola(c1)
        
        assertTrue {igualesColas(c1, c2)}

        println("Prueba superada ☺")
    }
}
