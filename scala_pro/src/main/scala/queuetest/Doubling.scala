package queuetest

trait Doubling extends IntQueue {

  abstract override def put(x: Int) = {
    // 추상클래스가 아닌 실제 구현 클래스의 put을 호출해서 처리
    super.put(2 * x)
  }

}
