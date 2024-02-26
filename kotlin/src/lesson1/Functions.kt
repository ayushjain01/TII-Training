package lesson1

fun display(name:String, greeting:String = "Hello"): Unit {
    println("$greeting! $name")
}

fun displaAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}
fun add(a:Int, b:Int) = a+b;
fun main() {
    display("Ayush")
    display("Sanidhya", "Hi")
    displaAll("Hello", "Hi", "How" , "are", "you","?")
    println("10+20=" + add(10,20))
    infix fun String.saysHiTo(name: String) = "Hi " + name + " from " + this
    println("Ayush" saysHiTo "Aman" )

}