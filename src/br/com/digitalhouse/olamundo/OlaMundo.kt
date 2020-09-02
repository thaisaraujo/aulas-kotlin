package br.com.digitalhouse.olamundo

fun main(){
    println("Olá Mundo!")
    println(mostrarMeuNome("Bispo", 24))
    println("-----------------------")
    println("LISTA DE ALUNOS")
    println(alunosDeAndroid()) //todos na mesma linha

    for (nome in alunosDeAndroid()){
        println(nome)
    }

}

fun mostrarMeuNome(sobrenome: String, idade: Int): String{
    val idadeRecebida = when (idade){
        18 -> "tem 18 anos"
        28 -> "tem 28 anos"
        38 -> "tem 38 anos"
        else -> "não se sabe a idade"
    }

    return "Thais $sobrenome e idade $idadeRecebida"

}

fun alunosDeAndroid(): ArrayList<String>{
    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Wagner")
    listaAlunos.add("Jéssica")
    listaAlunos.add("Vitória")

    return listaAlunos
}
