package pack1

class Func {
}
fun main(){
    val sum:Int=adding2numbers(15,25)
    println("${sum}")

}
fun adding2numbers(n1:Int,n2:Int):Int {
    val n3=n1+n2
    val num:Int=if (n3>=50) 100 else 200

    return num
}