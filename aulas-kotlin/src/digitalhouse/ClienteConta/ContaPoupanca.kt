package digitalhouse.ClienteConta

class ContaPoupanca (numeroDaConta: Int, saldo: Float, titular: Cliente, var juros: Float)
                     : Conta(numeroDaConta,saldo,titular) {

    override fun saque(valor: Float){
        if(saldo-valor > 0 && valor > 0){
            saldo -= valor
            println("Saque de R$${valor} realizado com sucesso. Saldo Atual: R$${saldo}")
        }else{
            println("Saldo insuficiente ou Valor Inválido para saque.")
        }
    }

    override fun depositar(valor: Float) {
        if(valor > 0) {
            saldo += valor
            println("Deposito de R$${valor} realizado com sucesso. Saldo Atual R$${saldo}.")
        }else{
            println("Valor Inválido para realizar deposito.")
        }
    }

    fun recolherJuros() {
            var calculoJuros = saldo*juros/100
            saldo -= calculoJuros
            println("Juros recolhido: R$$calculoJuros.")

        }

}


