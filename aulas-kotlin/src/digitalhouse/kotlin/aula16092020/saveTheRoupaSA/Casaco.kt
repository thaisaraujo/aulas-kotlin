package digitalhouse.kotlin.aula16092020.saveTheRoupaSA

class Casaco(marca: String, modelo: String) : Peca(marca, modelo) {

    override fun retirada() {
        println("Retirado do Produto: $marca | $modelo")
    }


    override fun toString(): String {
        return "Peça: $marca - $modelo"
    }
}