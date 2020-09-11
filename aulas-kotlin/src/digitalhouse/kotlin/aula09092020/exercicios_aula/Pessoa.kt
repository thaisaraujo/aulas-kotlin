package digitalhouse.kotlincomobjetos.aula09092020.exercicios_aula

class Pessoa(idade: Int = 0, especie: String = "", val nome: String) : Animal(idade, especie) {

    override fun locomover() {
        for (passos in 0..10){
            println("A pessoa $nome está no passo $passos")
        }
    }

    override fun comer(comida: String): String{
        return "O $nome está comendo $comida"
    }

    fun idadePessoa(){
        super.idade()
        if (idade >= 18)
            println("Pessoa é maior de idade")
    }


}