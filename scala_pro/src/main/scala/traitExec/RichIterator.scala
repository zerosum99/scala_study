package traitExec
//
// 추상클래스의 정보를 참조하기 위해 extends로 받는다.
// 트레이트에 하나의 메소드만 지정
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = {
    while (hasNext)
      f(next())
  }
}