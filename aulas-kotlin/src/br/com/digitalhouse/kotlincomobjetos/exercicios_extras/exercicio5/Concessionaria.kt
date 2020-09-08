package br.com.digitalhouse.kotlincomobjetos.exercicios_extras.exercicio5

class Concessionaria () {

    var listaDeVendas = ArrayList<Venda>()

    fun registrarVenda (veiculo: Veiculo, cliente: Cliente, valor: Double){
        listaDeVendas.add(Venda(veiculo, cliente, valor))
        println("Venda Registrada - Cliente:${cliente.nome} ${cliente.sobrenome} / Veiculo:${veiculo.marca}, ${veiculo.modelo}")
    }
}