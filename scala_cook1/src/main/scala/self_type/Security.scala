package self_type

trait Security {
  this: Animal =>   // <--- here is your self type
  def lookout: Unit = { stop(); println("looking out!") }
}
