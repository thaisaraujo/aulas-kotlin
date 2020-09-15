package digitalhouse.kotlin.aula14092020.fatura

class Item (val id: Int, val descricao: String, var quantidade: Int, var preco: Double){
    init {
        if (quantidade < 0){ quantidade = 0 }
        if (preco < 0) { preco = 0.0 }

    }



}