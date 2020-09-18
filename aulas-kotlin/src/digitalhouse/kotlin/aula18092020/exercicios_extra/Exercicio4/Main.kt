package digitalhouse.kotlin.aula18092020.exercicios_extra.Exercicio4

fun main(){
    val listaFuncionario = mutableListOf<Funcionario>()
    val func1 = Funcionario("Leonardo C", 10)
    val func2 = Funcionario("Leonardo B", 11)
    val func3 = Funcionario("Arthur", 12)
    val func4 = Funcionario("Matheus", 13)

    listaFuncionario.addAll(listOf(func1,func2, func3, func4))

    val novoFuncionario = Funcionario ("Thais", 13)

    println(listaFuncionario.contains(novoFuncionario))



}