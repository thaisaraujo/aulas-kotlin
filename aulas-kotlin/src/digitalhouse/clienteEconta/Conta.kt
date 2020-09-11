package digitalhouse.ClienteConta

abstract class Conta (val numeroDaConta: Int, var saldo: Float, val titular: Cliente) {


    abstract fun saque(valor: Float)

    abstract fun depositar(valor: Float)

}