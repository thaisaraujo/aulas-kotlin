package digitalhouse.kotlincomobjetos.aula09092020.exercicios_aula

open class Felino (open val cor: String = "") : Animal() {

    final override fun locomover() {
        for (passos in 0..2){
            println("O felino está se locomovendo com a cor: $cor")
            super.locomover()
        }
    }

    override fun comer(comida: String): String {
        return comida
    }

}