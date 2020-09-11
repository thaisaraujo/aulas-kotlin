package digitalhouse.kotlin.aula11092020.exercicios_extras.exercicioUML

fun main () {
    val registroRecebimento = RegistroRecebimento()
    registroRecebimento.adicionarRecebimento(ItemVenda("Telha 5m", 8, 150.50))
    registroRecebimento.adicionarRecebimento(Servico("Restauração da Calha", 3, 30.50))
    registroRecebimento.apresentarRecebimento()

}