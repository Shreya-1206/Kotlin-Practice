class Person(val name : String, var age : Int){
    fun greet(){
        println("Hello, my name is $name and I am $age years old")
    }

    fun wishHappyBirthday() {
        age += 1
        println("Happy Birthday to me! I am now $age years old")
    }
}

fun main() {
    val shreya = Person("Shreya", 23)
    shreya.greet()
    shreya.wishHappyBirthday()
}