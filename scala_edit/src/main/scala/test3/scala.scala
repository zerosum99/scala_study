package test3

object scala extends App {

  println("test 3 ==>")

  var apple = new Fruit("사과")
  println(apple.name)

  val flyingWhale = new Animal
  flyingWhale.fly
  flyingWhale.swim
  flyingWhale.eat
  flyingWhale.run

}

class Fruit(input: String) {
  var name = input
}

trait Swimming {
  def swim = println("수영을 합니다.")
}

trait Flying {
  def fly = println("납니다")
}

trait Running {
  def run = println("달립니다")
}

trait Eating {
  def eat
}

// 위 클래스를 상속받는 구체적인 Animal 클래스
class Animal extends Flying with Swimming with Running with Eating {
  override def eat : Unit = println("먹습니다")
}


