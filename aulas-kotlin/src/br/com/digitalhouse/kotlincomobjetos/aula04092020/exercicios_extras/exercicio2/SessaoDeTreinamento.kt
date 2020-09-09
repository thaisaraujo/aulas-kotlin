package br.com.digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicio2

class SessaoDeTreinamento (var experiencia: Int){

    fun treinarA(jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        val experienciaAnterior = jogador.experiencia
        jogador.experiencia += experiencia

        println("Dados do jogador ${jogador.nome}. Experiência inicial:${experienciaAnterior} e Experiencia final:${jogador.experiencia}\n")
    }

}