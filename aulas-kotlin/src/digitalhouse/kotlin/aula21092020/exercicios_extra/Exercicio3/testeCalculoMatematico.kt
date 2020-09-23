package digitalhouse.kotlin.aula21092020.exercicios_extra.Exercicio3

fun main(){
    val calculoMatematico = CalculoMatematico()

    try{
        calculoMatematico.divisao(4,0)
    }catch (ex : Exception){
        println(ex.message)
    }

}