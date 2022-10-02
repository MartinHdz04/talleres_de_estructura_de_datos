package TallerRecursion

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Funciones Recursivas
 * Fecha: 18 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.IList
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Halla el factorial del número entero n
 * n! = n * (n-1) * (n-2) * ... * 2 * 1
 */
fun factorial(n: Int): Int = when(n){
    0,1->1
    else->n* factorial(n-1)
}

/**
 * Halla el n-ésimo término de la serie de fibonacci
 */
fun fibonacci(n: Int): Int = when(n){
    1,2->1
    else-> fibonacci(n-1) + fibonacci(n-2)
}

/**
 * Permite determinar el término n,m del triángulo de Pascal
 * n = fila, m = término
 */
fun pascal(n: Int, m: Int): Int = when(Pair(n,m)){
    Pair(1,m),Pair(0,m),Pair(n,1),Pair(n,n+1) -> 1
    else -> pascal(n-1,m-1) + pascal(n-1,m)
}

/**
 * Halla el valor de a^b
 */
fun elevar(a: Int, b: Int): Int = when(Pair(a,b)){
    Pair(a,0) ->1
    Pair(1,b)->1
    Pair(0,b)->0
    Pair(a,1)->a
    else->a* elevar(a,b-1)
}

/**
 * Halla la suma de todos los números enteros entre 1 y n
 */
fun sumatoria(n: Int): Int = when(n){
    1->1
    2->3
    else->n+ sumatoria(n-1)
}

/**
 * Halla la suma de los cuadrados de los números de 1 hasta n
 */
fun sumaCuadrados(n: Int): Int = when(n){
    1->1
    2->5
    else->(n*n)+ sumaCuadrados(n-1)
}

/**
 * Hallar el valor de la serie 1/(2i+1) desde 1 hasta n
 */
fun serie(n: Int): Double = when(n){
    1->(1.0/((2*1)+1))
    2->(1.0/((2*2)+1))
    else->(1.0/((2*n)+1)) + serie(n-1)
}

/**
 * Permite saber la cantidad de digitos que posee un número entero positivo n
 */
fun contarDigitos(n: Int): Int{
    if(0<n && n<=9){return 1}
    else{return contarDigitos(n/10) + 1}
}

/**
 * Permite hallar la suma de los dígitos de un número entero positivo n
 */
fun sumarDigitos(n: Int): Int {
    if(0<=n && n<=9){return n}
    else{return sumarDigitos(n/10) + sumarDigitos(n%10)
    }
}

/**
 * Un número entero positivo en múltiplo de 3 si:
 *  - tiene una cifra y es 0, 3, 6, o 9
 *  - tiene más de una cifra y la suma de sus dígitos es múltiplo de 3
 *  - en cualquier otro caso, el número no es múltiplo de 3
 *
 *  - NO PUEDEN USAR LA OPERACIÓN MÓDULO (%)
 */
fun esMultiploDe3(n: Int): Boolean {
    if(contarDigitos(n) in 0..1){return n==0 || n==3 || n==6 || n==9}
    else{return esMultiploDe3(sumarDigitos(n))
    }
}

/**
 * Cuenta el número de dígitos pares que tiene un número entero positivo >= 1
 */
fun cantidadDigitosPares(n: Int): Int {
    if(n in 0..9){return (if(n%2==0){1} else{0})}
    else{return cantidadDigitosPares(n%10) + cantidadDigitosPares(n/10)
    }
}

/**
 * Determina si el número dado es binario o no.
 * Los números binarios solo contienen los dígitos 1 y 0
 * Por ejemplo: el número 100011110 es binario, pero 231 no lo es
 */
fun esNumeroBinario(n: Int): Boolean {
    if(n in 0..9){return n==0 || n==1}
    else{return if(n%10==0 || n%10==1){
        esNumeroBinario(n/10)
    }else{false}}
}

/**
 * Permite saber si el número dado posee el dígito indicado
 */
fun poseeDigito(n: Int, digito: Int): Boolean {
    if(n in 0..9){return n==digito}
    else{return if(n%10==digito){true} else{
        poseeDigito(n/10, digito)
    }}
}

/**
 * Retorna el dígito más grande que hace parte del número n
 * Ejemplo: el dígito más grande del númer 381704 es el 8
 */
fun digitoMasGrande(n: Int): Int {
    if(n in 0..9){return n}
    else{return 0}
}

/**
 * Imprimir cada elemento de la lista, pero de manera recursiva
 */
fun <T> imprimirLista(lista: IList<T>) {
    var copia=lista.copy()
    if(copia.isEmpty){print("")}
    else{println()}
}

/**
 * Obtiene recursivamente la lista de los dígitos del número entero positivo n
 * Ejemplo: digitos(351804) == [3, 5, 1, 8, 0, 4]
 */
fun digitos(n: Int): IList<Int> {
    TODO("Completar")
}

/**
 * Dado un número entero positivo >= 0, retorna una lista con la representación binaria
 * del número dado.
 * Ejemplo: convertirDecimalBinario(231) = List(1, 1, 0, 0, 1, 1, 1, 1, 1, 1)
 */
fun convertirDecimalBinario(n: Int): IList<Int> {
    TODO("Completar")
}

/**
 * Recursion con listas: Hallar la suma de los números pares de la lista que se recibe
 * como parámetro.
 * Ejemplo: sumarParesLista([40, 21, 8, 31, 6]) == 54
 */
fun sumarParesLista(lista: IList<Int>): Int {
    TODO("Completar")
}

/**
 * Recursión con listas: construir una función recursiva que retorne la posición del elemento en la lista
 * Si la lista está vacía, retorne -1. No se puede usar indexOf o lastIndexOf
 */
fun buscarElementoEnUnaLista(lista: IList<Int>, elem: Int): Int {
    TODO("Completar")
}

/**
 * Traduce los diversos dígitos de la lista a un número entero
 * Ejemplo: convertirListaDigitosNumero([3, 4, 1, 7, 9]) == 34179
 */
fun convertirListaDigitosNumero(digitos: IList<Int>): Int {
    TODO("Completar!")
}

/**
 * Función genérica y recursiva que permite saber si un elemento está dentro
 * de la lista. No debe usarse la función indexOf o contains. Debe ser
 * recursiva. Para buscar un elemento hay que tener en cuenta
 * - si la lista está vacía, el elemento no está
 * - si el primero de la lista es igual al elemento, retornamos true (el elemento está)
 * - sino es igual al primero, entonces hay que ver si el elemento está en el resto de la lista
 */
fun <T> existeElemento(lista: IList<T>, elem: T): Boolean {
    TODO("Completar")
}

/** Escribir una función recursiva que, sin usar pilas ni colas
 * ni ninguna otra lista, obtenga la misma lista, pero invertida
 */
fun invertirLista(lista: IList<Char>): IList<Char> {
    TODO("Completar")
}

/**
 * Una palabra es palíndrome si se lee igual de izquierda a derecha y de derecha
 * a izquierda. Esta función recibe la palabra (sin espacios) y de forma recursiva
 * determina si la palabra es palíndrome.
 */
fun esPalindrome(palabra: String): Boolean = TODO("Completar")

/**
 * Recursividad con listas. Escriba una función recursiva
 * Obtiene el número más grande de la lista. Si la lista está vacía retorne el número
 * entero más pequeño.
 */
fun mayorDeUnaLista(lista: IList<Int>): Int {
    TODO("Completar")
}


/**
 * Una clase auxiliar
 */
data class Punto(val x: Int, val y: Int) {
    fun distanciaAlOrigen(): Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))
}

/**
 * Recursivamente, obtener una lista con aquellos puntos que están en el origen o
 * que hacen parte del primer cuadrante.
 */
fun puntosPrimerCuadrante(puntos: IList<Punto>): IList<Punto> {
    TODO("Completar")
}

/**
 * Recursivamente, obtiene el punto que está más lejano del origen.
 * Si la lista está vacía, retorne null
 * Si la lista tiene un solo elemento, retorne ese elemento
 * si la lista tiene más de un elemento, tome el primer elemento y
 * compárelo con el punto más lejano del resto de la lista.
 */
fun puntoMasLejano(puntos: IList<Punto>): Punto? {
    TODO("Completar")
}
