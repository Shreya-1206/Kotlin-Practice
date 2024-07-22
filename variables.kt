// var and val
fun main() {
    var name = "shreya"
    val hobby = "dancing"
    val _isAdmin = false

    // However we can also specify type 
    var name2 : String = "Hinata"
    val hobby2 : String = "Drawing"
    var age : Int = 24
    
    //We can also declare variables without assiging values
    var name3 : String
    val ageKiya : Int
    ageKiya = 24
    name3 = "Kiya"
    name = "Digvijay"
 // hobby = "Acting"   /// here val cannot be reAssigned becuse it is strict than var 
    
    println("Name : " + name)
    println("Shreya is Admin : " + _isAdmin)
    println("Hobby : " + hobby)
    println("Hobby Of Hinata :" + hobby2)
    println("Age of Kiya : " + ageKiya)

}



