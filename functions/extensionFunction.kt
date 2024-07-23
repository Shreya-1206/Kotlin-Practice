fun String.isPalindrome(): Boolean{
    val reversed = this.reversed()
    return this == reversed
}

fun MutableList<Int>.swap(index1 :Int, index2 : Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}



fun main() {

    val list = mutableListOf(1, 2, 3)
    list.swap(1, 2) // 'this' inside 'swap()' will hold the value of 'list'
    println(list)

    val word = "racecar"
    println(word.isPalindrome())

    val anotherword = "hello"
    println(anotherword.isPalindrome())


}