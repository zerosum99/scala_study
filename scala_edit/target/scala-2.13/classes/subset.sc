val stateCapitals = Map("A"-> "a","B" -> "b", "C" -> "c")

stateCapitals.get("A" )
stateCapitals.get("D")

stateCapitals.get("A" ).get
stateCapitals.get("D").getOrElse("oops")
stateCapitals.get("B").getOrElse("oops")

println(stateCapitals.get("A" ).getClass)

println(stateCapitals.get("D" ).getClass)

1.toString

def isEven(n:Int) = (n%2) == 0

List(1,2,3,4).filter( (i: Int) => isEven(i)).foreach((i : Int) => println(i))

List(1,2,3,4).filter(i=>isEven(i)).foreach(i =>println(i))

List(1,2,3,4).filter(isEven).foreach(println)


Seq(1, "a")
List(1, "A")


def checkY(y:Int) = {
  for {
    x <- Seq(99,100,101)
  } {
      val str = x match {
        case `y` => " found y!"
        case i : Int => "int :" + i
      }
    println(str)
  }
}

checkY(100)



def fact(i:Int) : Long = {
  def fact(i:Int, accumulator : Int) : Long = {
      if (i <= 1) accumulator
      else fact(i-1, i * accumulator)
  }
  fact(i,1)
}

(1 to 5).foreach(i => println(fact(i)))

(1 to 10) filter (_ %2 == 0) map(_ * 2) reduce (_*_)

var result = 1
for (i <- (1 to 10) if i%2 == 0) {
   result = result * (i * 2)
}
println(result)


val onlyOne : PartialFunction[Int, String] = { case 1 => "one" }

onlyOne.isDefinedAt(1) // true
onlyOne.isDefinedAt(2) // false

onlyOne(1)



val func : PartialFunction[Int, Double] = { case i : Int=> i + 2900 }
func(100)




