package digitalhouse.kotlin.aula14092020.fatura

fun main (){

    var fatura = Fatura()
    fatura.adicionar(
            Item(187383,"Fone de Ouvido",3,100.0),
            Item(837319, "Placa de Som", 1, 245.50),
            Item(202020, "Protetor Auricular", 2, 23.45))

    println("Total ${fatura.getTotalFatura()}")





}



