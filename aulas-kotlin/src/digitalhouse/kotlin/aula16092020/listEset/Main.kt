package digitalhouse.kotlin.aula16092020.listEset

fun main(){

    val lista = mutableListOf<Int>()
    println("LISTA COM VALORES REPETIDOS")
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)
    print(lista)

    println("\nSET(CONJUNTO) COM VALORES NÃO REPETIDOS")
    val conjunto = mutableSetOf<Int>()
    conjunto.add(1)
    conjunto.add(5)
    conjunto.add(5)
    conjunto.add(6)
    conjunto.add(7)
    conjunto.add(8)
    conjunto.add(8)
    conjunto.add(8)
    print(conjunto)

}
