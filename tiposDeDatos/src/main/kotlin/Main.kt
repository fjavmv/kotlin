package fjavmvazquez.com

/**
 * @author FJMV
 * @sample: Tipos de datos y variables
 */
fun main() {
    var x = 100L
    var y = 113.5
    var f = 113.5f
    var i = 113
    var s: Short = 8
    var b: Byte = 1
    val direccion = """
       Huajuapan de Leon Oaxaca
       c.p. 69000
       No. 65
       Acatlima
    """
    var activar = true
    val arrX = intArrayOf(1,2,3,4,5,6,7,8,9)
    val arrY = doubleArrayOf(1.5,2.3,4.5,6.7,8.9,2.1)
    val arrC = charArrayOf('a','b','c','d','e')
    println(direccion)
    println(arrX[2])
    println(arrY[1])
    println(arrC[0])
}