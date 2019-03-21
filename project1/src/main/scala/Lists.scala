object Lists extends App{

  //creating a list object
  val mylist:List[Int]=List(1,2,3,4);
  println(mylist)

  //appending a value to list using acones
  println(0::mylist)

  //assiging value of a old List with appended value to a new List
  val mylistnew:List[Int]=(0::mylist)
  println(mylistnew)

  //Nil List   =>  List()
  println("Ram"::"Arjun"::"Chanik"::Nil)

  //print 1st value and remaining value
  println(mylist.head)  //print the first value
  println(mylist.tail)  //print the values except 1st value

  //methods in List
  println(mylistnew.isEmpty)
  println(mylistnew.reverse)
  println(mylistnew.max)

  //iterating through list
  mylist.foreach(println)

  var sum:Int=0
  mylist.foreach(sum+= _)
  println("Sum of myList is: "+sum)

  for(i<-mylistnew)
    {
      println("for loop: "+i)
    }

  //print specific element
  println(mylistnew(1))

  //intersection
  println(mylist.intersect(mylistnew))


}
