import scala.collection.mutable.ListBuffer

object Demo_listbuffer {
  def main(args: Array[String]) = {
    var myList = ListBuffer("Zara","Nuha","Ayan")
    println(myList);
    // Add an element
    myList += "Welcome";
    // Add two element
    myList += ("To", "Tutorialspoint");
    println(myList);
    // Remove an element
    myList -= "Welcome";
    // print second element
    println(myList(1));
  }
}

