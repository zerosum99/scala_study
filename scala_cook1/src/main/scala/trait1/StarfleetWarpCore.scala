package trait1

trait StarfleetWarpCore {
  this: Starship =>
  // more code here ...

  val b = this.a
  val c = this.func _
}

