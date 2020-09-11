package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicioAposentadoria

fun main(){
    val paulistana = Pessoa(34,"Feminino", 10)
    println(paulistana.verificarAposentadoria(paulistana.idade, paulistana.sexo, paulistana.anosContribuicao))

    val carioca = Pessoa(70, "Masculino", 35)
    println(paulistana.verificarAposentadoria(carioca.idade, carioca.sexo, carioca.anosContribuicao))

    val campineiro = Pessoa(61, "Feminino", 31)
    println(paulistana.verificarAposentadoria(campineiro.idade, campineiro.sexo, campineiro.anosContribuicao))

}