
import introscala._

object main {

  def main(args : Array[String]) : Unit = {
    println("Hello scala world")
    val a = new AAA
    println(a.get)

    val h = new Hello("주인님", 30)
    println(s" 이름 : ${h.name }, 나이 : ${h.age} ")
  }

}
