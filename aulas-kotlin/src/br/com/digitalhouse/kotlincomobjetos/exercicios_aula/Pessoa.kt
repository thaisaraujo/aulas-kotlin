package br.com.digitalhouse.kotlincomobjetos.exercicios_aula

import br.com.digitalhouse.kotlincomobjetos.exercicios_aula.Cachorro

class Pessoa(var nome: String, var sobrenome: String) {
    /*exemplo de init
    init {
        println("Nome: $nome ")
    }

    var sexo: String = "F"

    init {
        println("Sexo: $sexo")
    }
     */

    //exemplos de métodos
    fun andar(){
        println("A pessoa está andando $nome")
    }

    fun criarRG(nome: String, numero: Int): String {
        return nome + numero
    }

    fun passearcomDog(cachorro: Cachorro){
        print("A pessoa $nome esta passeando com cachorro ${cachorro.nome}")
    }


}