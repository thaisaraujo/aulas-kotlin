package digitalhouse.kotlin.aula18092020.exercicios_extra.Exercicio2

class Coca(val tamanho: Int, var preco: Double) {

    fun equals(coca: Coca): Boolean {
        return coca.tamanho == tamanho
    }

}