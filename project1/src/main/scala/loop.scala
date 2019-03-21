import scala.math.BigDecimal.long2bigDecimal

object loop extends App{
var x=0

while(x<10) {
  println(s"x is $x")
  x += 1

}


  x=0
do
  {
    println(s"x is $x")
    x+=1
  }while(x<10)

  for (i<- 1 to 5)
    {
      println("for to loop  i is "+i)

    }
  for (i<- 1 until 5)
  {
    println("for until loop i is "+i)

  }

  //to is a method
  for (i<- 1.to(5))
  {
    println("for loop i is "+i)

  }

  for (i<- 1.until(5))
  {
    println("for until loop i is "+i)

  }

  //list
  val lst=List(1,2,3,4,5,6)

  for (i<-lst)
    {
      println("List values"+i)

    }
  //list with filtering
  for (i<-lst;if(i<4))
  {
    println("List values filtered "+i)
  }

  //list values with expression
  val result=for {i<-lst;if(i<4)}
    yield{i*i}
  println("Result is : "+ result)

}