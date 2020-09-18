package digitalhouse.kotlin.aula18092020.exercicios_extra.Exercicio3

fun main(){
    val listaAluno = mutableListOf<Aluno>(
            Aluno("Leonardo C", 10),
            Aluno("Leonardo B", 11),
            Aluno("Arthur", 12),
            Aluno("Matheus", 13))

    val novoAluno = Aluno ("Thais", 13)

    println(listaAluno.contains(novoAluno))



}