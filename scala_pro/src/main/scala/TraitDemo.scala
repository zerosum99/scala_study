object TraitDemo {

  def main(args : Array[String]) = {
    println("+" * 30 )
    import traitExec._
    // 추상 클래스의 정보를 활용해서 상속과 트레이트 사용하는 방ㅃ
    // 추상 클래스 AbsIterator  지정
    // 츠상 클래스를 상속 받은 구현 클래스 StringIterator
    // 추상 클래스를 상속을 받지만 실제 추상클래스의 멤버를 사용하는 트레이트 RichIterator
    // 구현 클래스와 트레이트를 결합한 새로운 클래스 RicStringIter 생성
    class RichStringIter extends StringIterator("Scala") with RichIterator
    val richStringIter = new RichStringIter
    richStringIter.foreach(println)
  }

}
