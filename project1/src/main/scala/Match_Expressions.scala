//case
object Match_Expressions extends App {
val age=100

  age match{
    case 20=>println(age)
    case 22=>println(age)

    case _ => println("Default")
  }

  //return in match expression
  val result=age match {
    case 20=>age
    case 22=>age

    case _ => "Default return"
  }

  println(result)


  //OR in match expression
  val num=1
  num match{
    case 1|3|5|7|9 =>println("Odd")
    case 2|4|6|8|10 =>println("Even")

    case _=>println("Default")
  }

}
