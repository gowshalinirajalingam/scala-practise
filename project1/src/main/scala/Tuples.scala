object Tuples extends App{

  //Creating tuple
  val mytuple=(1,"hello",true,55)
  println(mytuple)
  //When creating tuple with new key word we have to give the size of tuple also with 'Tuple<size of tuple>'
  val mytuple2=new Tuple2("Hai",84)
  println(mytuple2)

  //tuple inside tuple
  val mytuple3=new Tuple3("Bye",84,(1,2))
  println(mytuple3._1)   //_1 means 1st element
  println(mytuple3._2)   //_2 means 2nd element
  println(mytuple3._3)   //_3 means 3rd element
  println(mytuple3._3._2)   //_3._2 means 3rd elements 2nd element

  //iterate through tuple
  mytuple3.productIterator.foreach{
    i=>println(i)
  }

}
