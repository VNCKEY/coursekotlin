var notR=1

fun hello() {
    return println("Hello, world!")
}

//fun hello() = println("Hello, world!")

//Default parameter values
fun suma(x:Int=0, y:Int=0):Int{
    return (x * y)
}

//Single-expression functions
fun suma2(x:Int=0, y:Int=0) = x * y

//Functions without return
fun sumaNotR(x:Int):Unit{
    notR+=x
}

fun main() {
    
    // Hello, world!
    hello()
    
    // Valores por entrada
    println(suma(5,4))
    
    // Valores con nombre Default parameter values
    println(suma())
    
    // Enviando con valores por entrada
    println(suma(y=7,x=4))
    
    // Enviando valores a Single-expression functions
    println(suma2(y=7,x=4))
    
    // Enviando valores a Functions without return
    println(notR)
    sumaNotR(5)
    println(notR)
    
    
}