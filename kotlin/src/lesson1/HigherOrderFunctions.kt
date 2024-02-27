package lesson1

fun calculate(vararg numbers: Int, operation: (Int, Int) -> Int) :Int{
    var res = 0
    for (a in numbers) {
        res = operation(res,a)
    }
    return res
}

fun adds(a:Int, b:Int) :Int{
    return a+b
}

fun generateMultiplier(a:Int): (Int) ->Int{
    return { b -> a*b }
}
fun main(){
    println(calculate(10,20,30,40,50, operation = ::adds))

    println("Printing 10's table using generateMultiplier function")
    for(i in 1..10){
        var multiplier = generateMultiplier(i)
        println("10x$i=${multiplier(10)}")
    }
}

