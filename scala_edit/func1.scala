
def add[A](x:A,y:A,f:(A,A)=>A) :A = f(x,y) 


println(add[Int](10,10,(x:Int, y:Int) => x+y))
println(add[String]("hello", "world",(x:String, y:String)=> x+y))