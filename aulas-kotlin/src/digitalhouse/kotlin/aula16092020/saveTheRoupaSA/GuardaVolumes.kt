package digitalhouse.kotlin.aula16092020.saveTheRoupaSA

class GuardaVolumes {
    val dicionario = mutableMapOf<Int,List<Peca>>()
    var contador = -1

    fun guardarPecas(listaDePeca : List<Peca>): Int {
        contador +=1
        dicionario.put(contador, listaDePeca)
        return contador
    }

    fun mostrarPecas(){
        if(dicionario.isNotEmpty())
            println(dicionario.forEach{i -> println(i)})
        else
            println("Guarda Volumes Vazio")
    }

    fun mostrarPecas(numero: Int){
        if(dicionario.contains(numero))
            println(dicionario[numero])
    }

    fun devolverPecas(numero: Int){
        println("Peças Removidas: ${dicionario[numero]}")
        dicionario.remove(numero)
    }

}




