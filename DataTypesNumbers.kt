val top_level_declaration : Int = 1234


fun main() {
    // All data Types
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String


    //Numbers divided into  -->> Integers positive or negative (such as 123 or -456) and       floating (float and Double)
          //Integers - Byte, Short , Int, Long
            //BYTE data type can store whole numbers from -128 to 127

            val num_byte : Byte = 120
            println("Byte Number : " + num_byte)
            println(num_byte::class)
            println("We can assces the top level declaration like this - " + top_level_declaration)

            //SHORT data type can store whole numbers from -32768 to 32767
            val num_short = -23234
            println("Short Number : " + num_short)

            //Int data type can store whole numbers from -2147483648 to 2147483647
            val num_int = 2147483647
            val num_int2 = -2147483648
            println("Int Number : " + num_int)
            println("Int Number : " +num_int2)

            //The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807
            val num_long = 223372036854775807
            val num_long3 = 1L
            println(num_long3::class)
            println("Long Number : "+num_long)


            //Difference Btw Int And Long 
            //A whole number is an Int as long as it is up to 2147483647. If it goes beyond that, it is defined as Long
            val num_int3 = 2147483647  // Int
            val num_long2= 2147483648  // Long

         //Floating - float and double are the data types 
          //FLOAT (4bytes) and precission goes up to 5 to 6 

           val num_float  = 8.99f 
           println("Float Number : "+num_float)
           println("Type of Float : ${num_float::class}")  

          //Double(8bytes) and here precission goes to the 15 to 18

           val num_double  = 82.992344556654334 
           println("Double Number : "+num_double)  
           println("Type of Double : ${num_double::class}")  

          //Scientific Number (power)
          val num_power = 10E2
          println("Power Number : "+num_power) 

          //Boolean
          val isKotlinFun = true
          val isFishTasty = false
          println("Is Kotlin Fun")
  
}