// file named as student.scala
// containing the main method
  
// using the college package name again
package college 
class student
{
    def studentmethod(){}
} 
  
// Creating object
object Main
{
  
    // Main method
    def main(args: Array[String])
    {
        val stu= new student()
        val fac= new faculty() 
        // faculty class can be accessed while
        // in different file but in same package.
    }
}