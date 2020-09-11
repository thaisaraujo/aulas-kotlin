package digitalhouse.kotlincomobjetos.aula11092020.exercicios_extras.interfacesKotlin

class Impressora (var filaDeImpressao : MutableList<Imprimivel> = mutableListOf()) {

    fun adicionar (vararg imprimivel: Imprimivel) = filaDeImpressao.addAll(imprimivel)

    fun imprimir(){
        for (item in filaDeImpressao){
            item.imprimir()
        }
        filaDeImpressao.clear()
    }
}