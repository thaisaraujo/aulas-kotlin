package digitalhouse.kotlin.aula18092020.exercicios_extra.Exercicio3

class Aluno(val nome: String, val numeroDeAluno: Int){

     override fun equals(other: Any?): Boolean {
        if(other == null || other != numeroDeAluno)
            return false
         else
            return true

    }

}