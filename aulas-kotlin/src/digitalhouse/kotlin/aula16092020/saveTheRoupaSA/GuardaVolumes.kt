package digitalhouse.kotlin.aula16092020.saveTheRoupaSA

class GuardaVolumes {
    val dicionario = mutableMapOf<Int,List<Peca>>()
    var contador = 0

    fun guardarPecas(listaDePeca : List<Peca>): Int {
        //contador +=1
        dicionario.put(contador, listaDePeca)
        return contador++
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
        if(dicionario.contains(numero)) { //verificar se a chave existe no map
            println("Peças Removidas: ${dicionario[numero]}") //imprimir lista de peças
            dicionario.getValue(numero).forEach { i -> i.retirada() } //para cada peça chamar a função retirada
            dicionario.remove(numero)
        }else{
            println("Não há peças associada a essa chave:$numero")
        }
    }

}




