package digitalhouse.kotlin.aula18092020.exercicios_aula

fun main(){

    var notebook1 = Notebook("Dell", 3000)
    println(notebook1)

    var notebook2 = Notebook("Positivo", 1500)
    println(notebook2)

    var temp1 = notebook1
    println(temp1)

    println(temp1.equals(notebook1)) //retornar true pq tem o mesmo endereço

    var temp2 = Notebook("Dell", 3000)
    println(temp2.equals(temp1)) //apesar das propriedades serem iguais o endereço de memória é diferente
                                 //então se for data class retorna true, cao ao contrário retorna false

    //se notebook fosse data class ao comparar as propriedades, então equals retornaria true
}