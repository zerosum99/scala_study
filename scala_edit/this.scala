object  this_ extends App {

    def func() : Unit = {
       println(" func call ")
    }

    println(" print :" + new Ran(10).pow())

    println(" Person " + new Person("name",15))

    func()
    
}


class Ran(n:Int) {

    require(n > 0)

    def pow() : Int  = {
        n * n
    }
}


class Person {
    private var name = ""
    private var age = 0

    def this(name : String) {
        this()
        this.name = name
        println(" this 1 ")
    }

    def this(name:String, age:Int) {
        this(name)
        this.age = age
        println(" this 2 ")
    }

}

