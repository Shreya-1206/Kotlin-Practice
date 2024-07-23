fun main() {
    var div = 5/2
    //println(div == 2.5f)  // error : equality cannot be applied to int andd double or float
    println(div == 2)

    val x = 5L / 2  //division btw two interger returns integer not float 
    println(x == 2L)

    println(2+9)
    println(123345677L*56)
    println(34.89*78.99)
    println(10.01/6)

    //Incase we want float then convert to double or float

    var a = 5 / 2.toDouble()
    println(a == 2.5)


}