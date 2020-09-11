package digitalhouse.kotlin.aula09092020

abstract class Animal(open val idade: Int = 0, open val especie: String = "")  {

    open fun locomover(){}

    fun idade(){
        println("Animal tem idade de $idade, e é da espécie $especie")
    }

    abstract fun comer(comida: String): String

}