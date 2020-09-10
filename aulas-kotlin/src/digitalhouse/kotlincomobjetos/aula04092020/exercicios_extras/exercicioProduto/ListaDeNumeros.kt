package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicioProduto

class ListaDeNumeros(var lista: Array<Int>) {

    fun produto(lista: Array<Int>){
        if(lista.isEmpty()){
            println("Lista vazia")
        }else{
            var produto = 1
            for(i in 0..lista.size-1){
                produto *= lista.get(i)
            }
            println("Produto da lista é $produto")
        }

    }
}