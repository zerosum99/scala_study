import queuetest.{BasicIntQueue, Filtering, Incrementing }

object DemoIncr {
  def main(args : Array[String]) = {
    println("=" * 30 )
    // 추상클래스 IntQueue를 상속한 BasicIntQueue 클래스 작성
    // 트레이트를 계층으로 처리할 때 동일한 메소드가 있을 경우 차례대로 처리
    val queue = new BasicIntQueue with Filtering with Incrementing

    queue.put(-1)
    queue.put(1)
    queue.put(2)


    println("=" * 30 )

    println(queue.status())

    println(queue.get + " " + queue.get())

    println("=" * 30 )
    // 추상클래스 IntQueue를 상속한 BasicIntQueue 클래스 작성
    // 트레이트를 계층으로 처리할 때 동일한 메소드가 있을 경우 차례대로 처리
    val queue1 = new BasicIntQueue with Incrementing with Filtering

    queue1.put(-1)
    queue1.put(1)
    queue1.put(2)
    println(queue1.status())


    println("=" * 30 )

    println(queue1.get + " " + queue1.get())
  }


}
