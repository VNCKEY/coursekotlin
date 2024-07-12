/**
 * Control flow
 * 
 */
fun main() {
    var numero:Int = 0
	val condicion=true
    
    if(condicion){
        numero+=4
        println("$numero")
    }else{
        numero+=2
        println("$numero")
    }
    
    // println("$numero") error
    
    println(if(numero > 3) numero+=1 else numero--)
    
    var condi:Char='a'
    
    when(condi){
        'a' -> println("letra a")
        'b'	-> println("letra b")
        'c'	-> println("letra c")
        else -> println("no existe la letra")
    }
    
    var result = when(condi){
        'a' -> "letra a"
        'b'	-> "letra b"
        'c'	-> "letra c"
        else -> "no existe la letra"
    }
    
    println(result)
    
    var edad = -1
    
    var cnEdad = when{
        (edad >= 18) -> "Mayor de edad"
        (edad < 18 && edad >0) -> "Mayor de edad"
        else -> "Ingresa un valor valido"
    }
    println(cnEdad)
    
    for(number in 15 downTo 1 step 2){
        println(number)
    }
    
    val listaEjemplo = listOf("UNO","DOS","TRES")
    
    
    for(i in listaEjemplo){
        println("El valor es:$i")
    }
   	
    var indexInt=0
    
    while(indexInt < 3){
        indexInt++
        println(indexInt)
    }
    
    var y=3
    
    do{
        y++
        println(y)
    }while(y < 5)
}