package br.com.digitalhouse.kotlincomobjetos.exercicios_extras.exercicio4

//altura em cm por ser int (enunciado)
class Tripe (var dobrado: Boolean, val alturaMinima: Int, val alturaMaxima: Int, var alturaAtual: Int) {

    fun definirAltura(novaAltura: Int){
        if(novaAltura < alturaMinima || novaAltura > alturaMaxima){
            println("Altura Invália. Altura deve ser maior ou igual a ${alturaMinima}cm e menor ou igual a ${alturaMaxima}cm")
        }else{
            alturaAtual = novaAltura
            println("Nova altura:${alturaAtual}cm")
        }
    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar(){
        println("Preparando para guardar")
        definirAltura(alturaMinima)
        dobrar()
    }

    fun prontoParaGuardar(){
        guardar()
        println("Pronto para Guardar.${if (dobrado) "Dobrado" else "Desdobrado"} e altura ${alturaAtual}cm")
    }

    fun usar(){
        println("Preparando para usar")
        desdobrar()
        definirAltura(alturaMaxima/2)
    }

    fun prontoParaUsar(){
        usar()
        println("Pronto para Usar. ${if (dobrado) "Dobrado" else "Desdobrado"} e altura ${alturaAtual}cm")
    }

}