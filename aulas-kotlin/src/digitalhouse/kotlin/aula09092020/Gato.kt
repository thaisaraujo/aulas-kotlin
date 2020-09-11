package digitalhouse.kotlin.aula09092020

class Gato : Felino() {
    override val cor: String = "amarelo"

    fun gatoAndando(){
        super.locomover() //locomover do Felino
        println("A cor é $cor")
    }



}