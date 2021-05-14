class Upper {
   def upper(strings: String*): Seq[String] = {
      strings.map((s:String) => s.toUpperCase())
   }
}

object Upper {
   def upper(strings: String*) = strings.map(_.toUpperCase())
}



object  MainObject {  
    def  main (args : Array [String]) : Unit =  {  
        val up = new Upper
        println(up.upper("A", "First", "Scala", "Program"))

        println(Upper.upper("A", "First", "Scala", "Program"))

    }  
}
