package digitalhouse.kotlin.aula14092020.fatura

class Fatura(var listaDeItens: ArrayList<Item> = ArrayList()) {

    fun adicionar(vararg item: Item){
        listaDeItens.addAll(item)
    }

    fun getTotalFatura(): Double{
        var total = 0.0
        for(i in listaDeItens){
            total += i.quantidade*i.preco
        }
        return total
    }

}