import traitSuper._

object DemoTraitSuper extends App {

  val c = new Child
  // 트레이트 내에 동일한 메소드가 있을 경우 처리하는 방법
  // 트레이트만 상속하는 경우 super 사용하면 제일 늦게 첨부된 트레이트 내의 메소드 처리
  println(s"c.printSuper = ${c.printSuper}")
  println(s"c.printMother = ${c.printMother}")
  println(s"c.printFather = ${c.printFather}")
  println(s"c.printHuman = ${c.printHuman}")

}

