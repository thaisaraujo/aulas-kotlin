package digitalhouse.kotlin.aula16092020.dicionario

fun main(){
    println("LOTERIAS")
    val loteria = Loteria()
    loteria.loteriaDosSonhos.forEach{i -> println(i)}

    println("\nAPELIDOS")
    val apelidos = Apelidos()
    apelidos.dicionarioApelidos.forEach{i -> println(i)}
}
