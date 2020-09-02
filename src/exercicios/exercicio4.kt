package exercicios

fun main(){
    imprimirNumero()
}

fun imprimirNumero(): {
    var numerosImpares = arrayListOf<Int>()

    for(x in 0..100){
        if(x % 2 == 0){
            numerosImpares.add(x)
        }
    }

    println(numerosImpares)

}