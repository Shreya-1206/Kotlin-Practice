fun main() {
    val a : Int = 1
    val boxA : Int? = a
    val anotherBoxA : Int? =a

    val b : Int = 300
    val boxB : Int? = b
    val anotherBoxB : Int? = b

    println(boxA === anotherBoxA)
    println(boxB === anotherBoxB)
}