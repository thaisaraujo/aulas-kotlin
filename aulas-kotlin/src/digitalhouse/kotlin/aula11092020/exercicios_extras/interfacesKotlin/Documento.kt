package digitalhouse.kotlincomobjetos.aula11092020.exercicios_extras.interfacesKotlin

class Documento(override val nome: String) : Imprimivel {
    override val tipo: String = "Documento"

    override fun imprimir() {
        println("Eu sou um documento word | Nome do arquivo:$nome - Tipo:$tipo")
    }
}