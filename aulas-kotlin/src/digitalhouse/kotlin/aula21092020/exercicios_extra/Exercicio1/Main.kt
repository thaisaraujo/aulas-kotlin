package digitalhouse.kotlin.aula21092020.exercicios_extra.Exercicio1

fun main(){

    try {
        var lista = arrayListOf<String>()
        lista.addAll(listOf("Pato", "Cachorro", "Gato"))
        println(lista[3])
    } catch (ex: Exception){
        println(ex)
    }

}