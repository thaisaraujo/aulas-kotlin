package digitalhouse.kotlin.aula11092020.exercicios_extras.exercicioUML

class RegistroRecebimento (var registro: MutableList<IRecebivel> = mutableListOf()) {

    //fun adicionarRecebimento(vararg r: IRecebivel) = registro.add(r)

    fun adicionarRecebimento(r: IRecebivel) =  registro.add(r)

    fun apresentarRecebimento() = registro.forEach{ r -> println(r)}
}