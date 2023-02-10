package pack1

import java.util.Scanner

class UserInput {
}
fun main(){
    println("enter ur name:")
    val name= readLine()
    println("hello, ${name}")
    println("enter ur number:")
    val num= readLine()
    println("yr number is ${num}")
    val sc=Scanner(System.`in`)
    println("enter n1")
    val n1=sc.nextInt()
    println("enter n2")
    val n2=sc.nextInt()
    println("sum is ${n1+n2}")
}