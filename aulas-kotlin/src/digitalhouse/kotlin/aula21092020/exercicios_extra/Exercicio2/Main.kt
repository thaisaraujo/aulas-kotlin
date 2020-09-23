package digitalhouse.kotlin.aula21092020.exercicios_extra.Exercicio2

import java.lang.NullPointerException

fun main(){

    var lista = arrayListOf<String>()

    try {
        println(lista[5])
    } catch (ex: NullPointerException){
        println("Ocorreu um erro: ${ex.message}")
        ex.stackTrace
    } catch (ex: IndexOutOfBoundsException){
        println("Ocorreu um erro: ${ex.message}")
        ex.stackTrace
    }

}