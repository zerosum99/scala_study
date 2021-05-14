val name : String = "reader"

println(s"Hello $name")
println(s"The answer ${6 * 7}")

println(raw"\\\\\\abc")
println("\\\\\\abc")
println(f" ${4.5 * 12.3}%.3f")
println(s" ${math.Pi}")
println(f" ${math.Pi}%.4f")

val s = "Hello, World !!!"
s indexOf('o')
s.apply(s.indexOf('o'))

s indexOf('o', s.indexOf('o') + 1)
s.apply(s indexOf('o', s.indexOf('o') + 1))


class Rational(val n:Int, val d:Int) {

  override def toString = n + "/" + d

  def this(n : Int) = this(n, 1)


  def add(that : Rational) : Rational = {
    new Rational(n + that.n, d + that.d)
  }

  def + (i : Int) = new Rational(n+i * d, d)
}

val oneHalf = new Rational(1,2)

println(oneHalf.n + " " + oneHalf.d)

println(oneHalf.add(oneHalf))

println(new Rational(10))


type Tuple = (Int,Int,Int)

def tl(t:Tuple)  = t match {
  case (a, b, c) => List(a, b, c)
}

tl((1,2,3))

def tll(t:Any)  = t match {
  case a : Tuple => a.productIterator.toList
    case _ => t
}

tll((1,2,3))

tll(List(1,2,3))





val a = new A
a.get





