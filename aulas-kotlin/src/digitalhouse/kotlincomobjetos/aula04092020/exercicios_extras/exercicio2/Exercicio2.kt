package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicio2

fun main(){
    val jogador1 = JogadorDeFutebol("Ronaldo", 100.0f, 50.0f, 5, 4)
    val jogador2 = JogadorDeFutebol("Messi", 90.5f, 45.0f, 8, 6)

    val sessao = SessaoDeTreinamento(40)

    sessao.treinarA(jogador1)
    sessao.treinarA(jogador2)

}