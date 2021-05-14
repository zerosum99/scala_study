package self_type

trait Security_ {
  this: { def stop():Unit } =>
  def lookout: Unit = { stop(); println("looking out!") }
}
