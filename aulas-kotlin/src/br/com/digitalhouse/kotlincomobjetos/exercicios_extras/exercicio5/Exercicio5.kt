package br.com.digitalhouse.kotlincomobjetos.exercicios_extras.exercicio5

fun main(){

    val carro = Veiculo("Ford", "K Sedan", 2016, "preto", 200f)
    val cliente = Cliente("Thais", "Araujo", 1123456789,"cliente@gamil.com")

    val concessionaria = Concessionaria()
    concessionaria.registrarVenda(carro, cliente, 35000.0)




}