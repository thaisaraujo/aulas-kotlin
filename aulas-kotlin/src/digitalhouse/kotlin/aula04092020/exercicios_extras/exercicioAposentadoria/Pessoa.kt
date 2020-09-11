package digitalhouse.kotlincomobjetos.aula04092020.exercicios_extras.exercicioAposentadoria

class Pessoa (var idade: Int, val sexo: String, var anosContribuicao: Int){

    fun verificarAposentadoria(idade: Int, sexo: String, anosContribuicao: Int): Boolean {
        if (anosContribuicao < 30) {
            var anosRestante = 30 - anosContribuicao
            print("Aposentadoria Negada: anos de contribuição insuficiente. Faltam $anosRestante anos. ")
            return false
        } else {
            if ((sexo.compareTo("Feminino") == 0 && idade >= 60) || (sexo.compareTo("Masculino") == 0 && idade >= 65)) {
                return true
            } else {
                return false
            }
        }
    }
}
