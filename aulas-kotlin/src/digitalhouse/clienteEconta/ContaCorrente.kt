package digitalhouse.ClienteConta

class ContaCorrente (numeroDaConta: Int, saldo: Float, titular: Cliente, val chequeEspecial : Float)
                     : Conta(numeroDaConta,saldo, titular) {

    override fun saque(valor: Float) {
        if(saldo-valor > 0 && valor > 0){
            saldo -= valor
            println("Saque de R$${valor} realizado com sucesso. Saldo Atual: R$${saldo}")
        }else {
            if (chequeEspecial - valor > 0) {
                saldo -= valor
                println("Saque de R$${valor} realizado com Cheque Especial. Saldo Atual: R$${saldo}")
            }

            else if(saldo <= -chequeEspecial){
                println("Saldo insuficiente.")
            }
        }
    }

    override fun depositar(valor: Float) {
        if(valor > 0) {
            saldo += valor
            println("Deposito de R$${valor} realizado com sucesso. Saldo Atual: R$${saldo}.")
        }else{
            println("Valor Inválido para realizar deposito.")
        }
    }


    fun depositarCheque(cheque : Cheque){
        saldo += cheque.valor
        println("Cheque Depositado no valor de R$${cheque.valor}. Saldo Atual: R${saldo}\nBanco:${cheque.bancoEmisso} - Data:${cheque.dataDePagamento}")
    }



}