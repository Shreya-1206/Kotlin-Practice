fun main() {
    //var a : Int = 1
    //val convert_long : Long? = a 
    //println(a === convert_long)   
     //Error intailizer mismatch excepted long?
    
    val b : Byte = 100
    val bl : Int? = b?.toInt()
    println(bl)
    //print(b === bl)  error says prohibited
    println(bl === b?.toInt()) 

}

//doubt is that first example did'nt converted at all but the second did with an error 