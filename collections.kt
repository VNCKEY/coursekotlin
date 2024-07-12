/**
 * COLLECTIONS
 * 
 */
fun main() {
    
	val listLectura:List<String> = listOf("a", "b", "c")
    //listLectura.add("d") error por defecto tiene la configuracion de solo lectura
    println("${listLectura}")
	//println("${listLectura[0]}")
	

	//con la palabra Mutable se puede cambiar sus propiedades
	val lista: MutableList<String> = mutableListOf("c", "b", "a")
    lista.add("d")
    
    println("${lista}")
	println("${lista.count()}")
    println("b" in lista)
    
    
    val setFrutas = setOf("manzana", "uva", "naranja", "naranja")
    //setFrutas.add("banana") error
	println("$setFrutas")
    
	val frutas: MutableSet<String> = mutableSetOf("manzana", "uva", "naranja", "naranja")
	frutas.add("banana")
    println("$frutas")
    
    // frutasblock es unicamente lectura 
	val frutasblock: Set<String> = frutas
    
    println("$frutasblock")
 
 	//----Map
 	val mobiles:Map<String, Int> = mapOf("samsung" to 100, "huawei" to 190, "oppo" to 100)
	println(mobiles)
	//mobiles.put("honor" to 120) error
    
	val mobilesM: MutableMap<String, Int> = mutableMapOf("samsung" to 100, "huawei" to 190, "oppo" to 100)
	mobilesM.put("honor", 120)
    println(mobilesM)
	mobilesM.remove("honor", 120)
    println(mobilesM.count())
    println("samsung" in mobilesM)
    
    
}