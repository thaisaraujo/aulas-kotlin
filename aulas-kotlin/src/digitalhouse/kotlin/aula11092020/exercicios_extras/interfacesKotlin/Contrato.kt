package digitalhouse.kotlincomobjetos.aula11092020.exercicios_extras.interfacesKotlin

class Contrato(override val nome: String) : Imprimivel {
    override val tipo: String = "Contrato"

    override fun imprimir() {
        println("Sou um contrato muito legal | Nome do arquivo:$nome - Tipo:$tipo")
    }
}