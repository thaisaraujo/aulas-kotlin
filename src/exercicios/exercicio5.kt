package exercicios

fun main(){
    println(analisaNumero(10,20,1,2))
}

fun analisaNumero(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    return (numA > numC && numA > numD || numB > numC && numB > numD)
}