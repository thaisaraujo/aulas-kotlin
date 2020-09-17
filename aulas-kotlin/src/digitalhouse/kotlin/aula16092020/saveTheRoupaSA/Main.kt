package digitalhouse.kotlin.aula16092020.saveTheRoupaSA

fun main(){

    val listaDeCasaco = listOf<Casaco>(Casaco("PAG", "blazer"), Casaco("RAZA", "suéter"))
    val guardaVolumes = GuardaVolumes()
    val chave = guardaVolumes.guardarPecas(listaDeCasaco)

    println("PEÇAS GUARDADADAS")
    println("Chave: ${chave} | $listaDeCasaco")

    println("\nMOSTRAR PEÇAS SEM PARÂMETROS")
    guardaVolumes.mostrarPecas()

    println("\nMOSTRAR PEÇAS COM PARÂMETRO DA CHAVE")
    guardaVolumes.mostrarPecas(chave)

    println("\nREMOVER PEÇAS COM PARÂMETRO DA CHAVE")
    guardaVolumes.devolverPecas(chave)

    println("\nESTADO FINAL DO GUARDA VOLUMES")
    guardaVolumes.mostrarPecas()
}