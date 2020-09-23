package digitalhouse.kotlin.aula21092020.exercicios_extra.Exercicio3

import java.lang.ArithmeticException
import java.lang.Exception

class CalculoMatematico {

    /*
    fun divisao(dividendo: Int, divisor: Int): Int {
         try {
             return divisor / dividendo
         } catch (ex: ArithmeticException){
             println("Ocorreu um erro, operação não pode ser realizada: ${ex.message}")
             ex.stackTrace
             return 0
         }
     }*/

    fun divisao(dividendo: Int, divisor: Int): Int {
        if(divisor==0){
            throw ArithmeticException("Operação não definida: divisão por zero")
        }else{
            return dividendo/divisor
        }
    }


}