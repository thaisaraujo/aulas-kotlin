package digitalhouse.kotlin.aula11092020.exercicios_extras.exercicioUML

class ItemVenda (val produto: String, val quantidade: Int, val valor: Double) : IRecebivel {

    override fun totalizarReceita(): Double = quantidade*valor

    override fun toString(): String {
        return "Produto:$produto - Quantidade:$quantidade - Valor(unidade):$valor | Total R$${totalizarReceita()}."
    }

}