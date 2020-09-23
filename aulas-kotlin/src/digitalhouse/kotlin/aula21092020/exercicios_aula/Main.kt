package digitalhouse.kotlin.aula21092020.exercicios_aula

fun main(){

    try {
        val numeros = listOf("um", "dois", "três")
        println("Terceiro Elemento: ${numeros.get(3)}") //erro: index 3 out of bounds for length 3
    } catch (ex: Exception){
        println("Ocorreu uma exeção ${ex.message}")
        ex.stackTrace
    }


    var x=2
    var y=0
    var z=6

    try{
        println((x*z)/y) //erro: / by zero
    } catch (ex: Exception){
        println("Ocorreu uma exeção ${ex.message}")
        ex.stackTrace
    }






}