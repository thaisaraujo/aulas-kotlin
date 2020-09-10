package digitalhouse.ClienteConta

fun main(){

    println ("CLIENTE CONTA POUPANÇA --------------------------------------------------------------------------")
    val clientePop = Cliente (101,"Harry", "Potter", 123456789, 111222333)
    val contaPop = ContaPoupanca(2020,100f, clientePop,10f)

    contaPop.depositar(50f)
    contaPop.saque(200f)
    contaPop.saque(30f)
    contaPop.recolherJuros()


    println ("\n\nCLIENTE CONTA CORRENTE ---------------------------------------------------------------------------")
    val clienteCor = Cliente (202,"Draco", "Malfoy",987654321, 333222111)
    val chequeCorrente = Cheque(120f,"Santander", "09/09/2020")
    val contaCor = ContaCorrente(3030,500f,clienteCor,chequeCorrente,200f)

    contaCor.depositarCheque(chequeCorrente)
    contaCor.depositar(500f)
    contaCor.saque(1000f)
    contaCor.saque(150f)


}