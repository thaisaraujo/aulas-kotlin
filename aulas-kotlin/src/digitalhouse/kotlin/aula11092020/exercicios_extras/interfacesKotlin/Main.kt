package digitalhouse.kotlincomobjetos.aula11092020.exercicios_extras.interfacesKotlin

fun main() {
    val impressora = Impressora()
    impressora.adicionar(Documento("aulaDeInterface"), Foto("uml"), Contrato("edital"))
    impressora.imprimir()
}