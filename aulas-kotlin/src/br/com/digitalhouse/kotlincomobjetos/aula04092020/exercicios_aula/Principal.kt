package br.com.digitalhouse.kotlincomobjetos.aula04092020.exercicios_aula

import java.util.*

fun main() {
    //Criação do Objeto
    val brasileiro = Pessoa("Thais", "Araujo")
    val cachorro = Cachorro("Capitu", 4, "RND")
    //brasileiro.andar()
    //print(brasileiro.criarRG(brasileiro.nome, 123456789 ))
    //brasileiro.passearcomDog(cachorro)


    /*
    val brasileiro = Pessoa()
    println("O nome do brasileiro(a) é ${brasileiro.nome} e tem a idade de ${brasileiro.idade} anos")
    brasileiro.nome = "Maria"
    println("O nome do brasileiro(a) é ${brasileiro.nome} e tem a idade de ${brasileiro.idade} anos")
    //-------------------------------------------------------------------------------------
    // raca e idade são apenas parametros, essas propriedades precisam ser criadas
    val cachorro = Cachorro("Capitu", 4, "RNA")
    println("O nome do cachorro é ${cachorro.nome}")
    println("A raça do cachorro é ${cachorro.raca} e idade ${cachorro.idade}")
    */

    val scanner = Scanner(System.`in`)

    print("Olá digite seu nome: ")
    val nomeRecebido = scanner.next()
    print("Olá $nomeRecebido")

}
