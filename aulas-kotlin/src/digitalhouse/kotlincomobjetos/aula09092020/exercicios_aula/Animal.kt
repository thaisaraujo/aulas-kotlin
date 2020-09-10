package digitalhouse.kotlincomobjetos.aula09092020.exercicios_aula

abstract class Animal(open val idade: Int = 0, open val especie: String = "")  {

    open fun locomover(){}

    fun idade(){
        println("Animal tem idade de $idade, e é da espécie $especie")
    }

    abstract fun comer(comida: String): String

}