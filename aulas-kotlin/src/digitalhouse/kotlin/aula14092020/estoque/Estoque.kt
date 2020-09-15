package digitalhouse.kotlin.aula14092020.estoque

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    fun mudarNome(nome: String){
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int){
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int){
        qtdAtual+=qtd
    }

    fun darBaixa(qtd: Int){
          qtdAtual -= qtd
    }

    fun mostrar(): String{
        return "Produto:$nome - Quantidade Mínima:$qtdMinima - Quantidade Atual:$qtdAtual"
    }

    fun precisaRepor(): Boolean{
        return (qtdAtual <= qtdMinima)
    }



}