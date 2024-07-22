fun main() {
    //  var a : Int = 1
    //  val convert_long : Long? = a 
    //  println(a == convert_long)    //Error identity equality for arguments types byte and int 
    
    val b : Byte = 100
    val bl : Int? = b?.toInt()
    println(bl)
    print(bl === b?.toInt())

}