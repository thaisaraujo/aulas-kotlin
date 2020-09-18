package digitalhouse.kotlin.aula18092020.exercicios_extra.Exercicio1

class Pessoa(var nome: String, val RG: Int) {

    fun equals(pessoa: Pessoa): Boolean {
        return pessoa.RG == RG
    }
}