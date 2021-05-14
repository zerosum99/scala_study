trait Interface_[A] {
    def add (value: A): A
}


class IntAdd(val num:Int) extends Interface_[Int] {
    override def add(value: Int) : Int = num + value
}

class DoubleAdd(val num:Double) extends Interface_[Double] {
    override def add(value: Double) : Double = num + value
}


val i = new IntAdd(100)
val f = new DoubleAdd(200)

println(i.add(10))

println(f.add(10))