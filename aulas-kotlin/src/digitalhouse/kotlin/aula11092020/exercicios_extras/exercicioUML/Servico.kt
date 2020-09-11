package digitalhouse.kotlin.aula11092020.exercicios_extras.exercicioUML

class Servico(val descricao: String, val horas: Int, val precoHora: Double) : IRecebivel {

    override fun totalizarReceita(): Double = precoHora*horas

    override fun toString(): String {
        return "Serviço:$descricao - Total de Horas:$horas - Preço Hora:$precoHora | Total R${totalizarReceita()}"
    }
}