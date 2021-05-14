import scala.collection.immutable.ListSet

object Demo_listset {
  def main(args: Array[String]) = {
    var myList: ListSet[String] = ListSet("Zara","Nuha","Ayan");
    // Add an element
    var myList1: ListSet[String] = myList + "Naira";
    // Remove an element
    var myList2: ListSet[String] = myList - "Nuha";
    // Create empty set
    var myList3: ListSet[String] = ListSet.empty[String];
    println(myList);
    println(myList1);
    println(myList2);
    println(myList3);
  }
}

