package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicio1

class Conta (val numeroDaConta: Int, var saldo: Float, val titular: Cliente) {

    fun depositar(valor: Float) {
        if(valor > 0) {
            saldo += valor
            println("Novo saldo de ${saldo}")
        }else{
            println("Valor Inválido para realizar deposito")
        }

    }

    fun saque(valor: Float){
        if(saldo-valor < 0){
            println("Saldo insuficiente para realizar saque")
        }else{
            println("Saque realizado com sucesso. Saldo: ${saldo}")
        }
    }
}