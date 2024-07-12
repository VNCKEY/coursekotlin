fun main() {
    
    var funcionlambda = {text:String -> text.uppercase()}("vnc")
    
    println(funcionlambda)
    
    //Invoke separately
    println({t:String -> t+"xd2"}("xd1"))
    
    //Assign to variable
    var funcionLambda2 = {text:String -> text.uppercase()}
    
	println(funcionLambda2("vnc2"))
    
    //Pass to another function
    val listNumbers:Set<Int> = setOf(-4,-3,-2,-1,0,1,2,3,4)
    var result 	= listNumbers.filter{x -> x > 0}
    var result2	= listNumbers.map{x -> x < 0}
    println(result)
    
    val mobiles:Map<String, Int> = mapOf("samsung" to 100, "huawei" to 190, "oppo" to 100)
    var result3=mobiles.keys.filter{x -> x.length > 4}
    println(result3)
    
    //Function types
    var typeFun:(String,String) -> String = {x,y -> x+y}
    println(typeFun("Hola","VNC"))
    
    var test=11
    var typeFunUnit:() -> Unit = {test++}
    println(test)
    println(typeFunUnit())
    println(test)
    
    //Return from a function
    
    
    fun returnlambda(t:String):(Int) -> Int = when(t){
        "hour" -> {x -> x * 60 * 60}
        "minutes" -> {x -> x * 60}
        else -> {x -> x}
    }
    
    val listHour	= listOf(1,2,2)
    val textoL	=	"hour"
    val hora	=	5
    val rlambda	=	returnlambda(textoL)
    val resultF	=rlambda(hora)
    val resultFL	=listHour.map(rlambda).sum()
    println(resultF)
    println(resultFL)
    
    //Trailing lambdas
    println(listOf(1,2,3).fold(0,{x,y -> x + y}))
    println(listOf(1,2,3).fold(0){x,y -> x + y})

    fun repeatN(n: Int, action: () -> Unit) {
    	for (i in 1..n) {
        	action()
    	}
	}


    repeatN(5) {
        println("Hello")
    }
}