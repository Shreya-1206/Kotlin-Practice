fun main() {
    var customers = 10  // here kotlin's compliler knows it is Int 

    //Now we can implement calculation

    customers.plusAssign(10)
    customers *= 2
    customers -= 10

    println("Count of Customers after cal - $customers")

    
}