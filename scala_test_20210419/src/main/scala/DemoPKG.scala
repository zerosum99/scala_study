object DemoPKG extends App {

  import com.scala._


  val p = new Packages
  println(" package : " + p.name)

  import com.scala.www._

  val e = new Emp
  println(" package : " + e.getName)

  if (e.getClass == classOf[Emp]) {
    println(" class type checking ")
  }

}

