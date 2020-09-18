package digitalhouse.kotlin.aula18092020.exercicios_extra.Exercicio4

class Funcionario(val nome: String, val numeroDeFuncionario: Int) {

    override fun equals(other: Any?): Boolean {
        if(other == null || other != numeroDeFuncionario)
            return false
        else
            return true
    }


}