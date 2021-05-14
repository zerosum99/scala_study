package queuetest

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x : Int) = {
    println(" class BasicIntQueue ")
    buf += x
  }
  def status()  = buf
}
