fun printMessage(message : String) : Unit{
    println("With Unit")
   
}

fun main() {
    printMessage("Hey")
    printMessage2("Hey2")
    printMessagePrefix("Hello Details")
    printMessagePrefix("hello from shreya", prefix ="Details")
    println(sum(2,7))
}

fun printMessage2(message : String) {
  println(message)
}

// with default para
fun printMessagePrefix(message :String, prefix : String ="Info"){
    println("$prefix : ${message}")
}


// Function that returns a Integers
fun sum(x :Int, y:Int) : Int{
    return x + y
}
