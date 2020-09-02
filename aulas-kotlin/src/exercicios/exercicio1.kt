package exercicios

fun main(){
    println(maiorNumero(5, 10 , 3))
}

fun maiorNumero(a: Int, b: Int, c: Int): Int {

    var maior = a

    if(maior < b){
        maior = b
    }
    if(maior < c){
        maior = c
    }

    return maior
}