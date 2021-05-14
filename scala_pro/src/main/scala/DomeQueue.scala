import queuetest._

object DomeQueue {

  def main(args : Array[String]) = {
    println("=" * 30 )
    // 추상클래스 IntQueue를 상속한 BasicIntQueue 클래스 작성
    val queue = new BasicIntQueue
    queue.put(10)
    queue.put(20)
    println(queue.get() + " " + queue.get())

    println("=" * 30 )
    // BascicIntQueue를 상속
    // IntQueue를 상속한 Doubling 트레이트를 결합
    // Doubling 트레이트 네부에  put 함수 구현 내부에 super.put을 사용해서 처리
    val queue1 = new MyQueue
    println(queue1.put(20) + " " + queue1.get())
  }

}
