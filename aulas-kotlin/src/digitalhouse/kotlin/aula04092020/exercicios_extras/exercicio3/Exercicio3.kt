package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicio3

fun main(){
    val atleta1 = Atleta("Marta", 10, 80.3f)
    val atleta2 = Atleta("Fabiana", 7,75.4f)


    val provas1 = listOf<Prova>(
            Prova(3, 45.0f),
            Prova(7, 78.3f),
            Prova(9, 90.7f)
    )

    val provas2 = listOf<Prova>(
            Prova(4, 40.3f),
            Prova(7, 76f),
            Prova(10, 75f)
    )

    println("Dados para o primeiro Atleta:${atleta1.nome}")
    provas1.forEach { prova -> println(prova.podeRealizar(atleta1)) }
    print("\n")
    println("Dados para o segundo Atleta:${atleta2.nome}")
    provas2.forEach { prova -> println(prova.podeRealizar(atleta2)) }


}