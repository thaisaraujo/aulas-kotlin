package exercicios_02

import kotlin.test.assertTrue

fun main(){
    var android = "Curso Mobile Android Digital House"
    var ios = "Curso Mobile IOS Digital House"
    var curso = "Curso Digital House"

    println(compararString(android, ios))
    println(compararString(curso, curso))
}

fun compararString(texto1: String, texto2: String): Boolean {

    return ((texto1 == texto2))

}