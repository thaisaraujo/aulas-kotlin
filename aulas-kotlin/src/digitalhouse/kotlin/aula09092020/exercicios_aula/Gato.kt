package digitalhouse.kotlincomobjetos.aula09092020.exercicios_aula

class Gato : Felino() {
    override val cor: String = "amarelo"

    fun gatoAndando(){
        super.locomover() //locomover do Felino
        println("A cor é $cor")
    }



}