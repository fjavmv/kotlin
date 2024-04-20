package fjavmvazquez.com
/*
    Conversion entre tipo de datos
 */
fun main() {
    //Conversion explicita
    val x = 10
    val f = 10.5
    val d = x.toDouble()
    val y = f.toInt()
    println("x = $x")
    println("d = $d")
    println("y = $y")
    //Conversion implicita
    val a = 5
    val b:Double = a + 1.0
    println(b)
    //Operadores importantes
    //Operadores unarios
    val c = -8
    val e = c.unaryPlus()
    val s = c.unaryMinus()
    println(c)
    println(e)
    println(s)

}