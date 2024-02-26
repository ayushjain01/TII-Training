package lesson1

fun main() {
    val telllength: (String) -> Int = {str: String -> str.length}
    println("length of string 'ayush' is " + telllength("ayush"))

    val add = {a: Int, b:Int -> a+b}
    println("10+20="+add(10,20))

    val display: (String) -> Unit = { println(it) }
    display("hello, World!")
}