package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicioFatorial

class Fatorial (var numero: Int) {

    //POR RECURSÃO
    fun fatorial(numero: Int): Int {
        if (numero == 0){
            return 1
        }else{
            return numero*fatorial(numero-1)
        }
    }

}

fun main(){

    val fat = Fatorial(7)

    println("Fatorial de ${fat.numero} é ${fat.fatorial(fat.numero)}")

}