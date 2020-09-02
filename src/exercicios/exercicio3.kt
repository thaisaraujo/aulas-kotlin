package exercicios

fun main (){
    println(paridade(10))
}

fun paridade (num: Int): String{
    if(num % 2 == 0){
        return "par"
    }else {
        return  "ímpar"
    }

}