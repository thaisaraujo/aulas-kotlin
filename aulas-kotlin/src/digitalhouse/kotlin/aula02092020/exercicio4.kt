package exercicios_02

fun main(){
    println(imprimirNumero())
}

fun imprimirNumero(): ArrayList<Int>{
    var numerosImpares = arrayListOf<Int>()

    for(x in 0..100){
        if(x % 2 != 0){
            numerosImpares.add(x)
        }
    }

    return numerosImpares

}