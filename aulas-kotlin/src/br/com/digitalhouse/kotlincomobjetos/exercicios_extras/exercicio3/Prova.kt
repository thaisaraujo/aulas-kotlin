package br.com.digitalhouse.kotlincomobjetos.exercicios_extras.exercicio3

class Prova(val dificuldade: Int, val energia: Float) {

    fun podeRealizar(atleta: Atleta): Boolean = (atleta.nivel >= dificuldade && atleta.energia >= energia)

}