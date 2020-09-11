package digitalhouse.kotlincomobjetos.aula11092020.exercicios_extras.interfacesKotlin

class Foto(override val nome: String) : Imprimivel {
    override val tipo: String = "Foto"

    override fun imprimir() {
        println("Eu sou uma selfie | Nome do arquivo:$nome - Tipo:$tipo")
    }


}