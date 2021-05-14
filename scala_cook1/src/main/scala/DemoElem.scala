import elements._

object DemoElem extends  App {
   println(" Element processing ")

  //추상 클래스를 사용해서 객체를 생성할 때는 중괄호 블럭에 추상메소드를 구현해야 함
  val e = new Element { def contents = Array("1", "2")}
  // 내부 원소 값 출력하기
  for (i <- e.contents) println(i)
  e.contents.foreach(println)

  // 추상클래스 Element 상속
  val ae = new ArrayElement(Array("dahl","Moon"))
  ae.contents.foreach(println)
  // ArrayElement 상속
  val le = new LineElement("daaaa")
  le.contents.foreach(println)

  def invokeDemo(e: Element) = {
    e.demo()
  }

  invokeDemo(new Element { def contents = Array("1", "2")} )
  invokeDemo(new ArrayElement(Array("Kim")))
  invokeDemo((new LineElement("moon")))
  invokeDemo(new UniformElement('a',1,1))
}
