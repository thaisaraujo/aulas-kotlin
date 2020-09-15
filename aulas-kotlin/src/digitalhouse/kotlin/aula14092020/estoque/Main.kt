package digitalhouse.kotlin.aula14092020.estoque

fun main(){
    var estoque = Estoque("Álcool em Gel", 25, 5)
    println(estoque.mostrar())

    estoque.mudarNome("Álcool em Gel 70%")
    println(estoque.mostrar())

    estoque.mudarQtdMinima(10)
    println(estoque.mostrar())

    estoque.repor(15)
    println(estoque.mostrar())

    estoque.darBaixa(35)
    println(estoque.mostrar())

    var statusEstoque = estoque.precisaRepor()
    println("Precisa Repor: ${if (statusEstoque) "sim" else "não"}")


}

