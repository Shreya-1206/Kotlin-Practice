fun main(){
    val x = 5  //101
    val y = 3  //011

    val andResult = x and y
    println("And result  : ${andResult}") // 001 --> 1

    val orResult =  x or y
    println("Or result :  ${orResult}") // 111 ---> 7

    val xorResult = x xor y
    println("XOR Result : ${xorResult}") // 110 ---> 6

    val notResult = x.inv()
    println("Not called inversion Result : ${notResult}") // 010 ---> -6

    val shiftLeft = x shl 1
    println("X shift Left Result : ${shiftLeft}")

    val shiftRight = x shr 1
    println("X shift Right Result : ${shiftRight}")

    val ushrResult = x ushr 1
    println("x ushr 1 : $ushrResult")  


}