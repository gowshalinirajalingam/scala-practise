package excercise1

object Expressions extends App {
  val multiplication : Double = {
    val a = 123456
    val b = 987654
    a*b
  }

  println("Multiplication: "+multiplication)

  val celsiusToFahrenheit : Double = {
     val a = 36
    (a * 9/5) + 32

  }

  println("celsius to fahrenheit: "+celsiusToFahrenheit)

}
