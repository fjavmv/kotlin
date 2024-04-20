package fjavmvazquez.com

/**
 * @author Francisco Javier
 * @param  x parametro x
 * @param  y parametro y
 * @return suma de x y y
 * @sample: x=5 + y=6 = 11
 */

fun suma(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    val r = suma(5, 6)
    println("El resultado de la suma es: $r")
}