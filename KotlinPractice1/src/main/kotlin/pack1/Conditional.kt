package pack1

class Conditional {
}
fun  main(){
    var n1=25
    var n2=56
    var max:Int=if(n1>n2) n1 else n2
    println("${max}")
    var neme:String="kotlin"
    val a:String=if (neme=="gautam") {
        "wrong name"
    } else if (neme=="kotlin"){
        "correct name"
    }
    else{
        "arbitary name"
    }
    println("${a}")
    val ans:String=when{
        neme=="gautam"->"wrong name"
        neme=="kotlin"->"correct name"
        else->"arbitary name"
    }
    println("${ans}")


}