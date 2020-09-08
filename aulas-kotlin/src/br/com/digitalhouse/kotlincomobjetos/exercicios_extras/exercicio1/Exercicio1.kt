package br.com.digitalhouse.kotlincomobjetos.exercicios_extras.exercicio1

fun main(){

    val cliente1 = Cliente ("Harry", "Potter")
    val cliente2 = Cliente ("Draco", "Malfoy")

    val conta1 = Conta(123, 500000.0f, cliente1)
    val conta2 = Conta(456,1500000.0f, cliente2)


    conta1.depositar(1500f)
    conta1.saque(1000000f)

    conta2.depositar(200f)
    conta2.saque(600000f)

}