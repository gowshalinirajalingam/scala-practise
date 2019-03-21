object sets extends App{

  //set removes duplicate values

  val myset:Set[Int]=Set(1,8,5,9,8)
  val myset1:Set[Int]=Set(22,44,4,1,5)
  println(myset)

  //append(add) a value to set
  println(myset+10)

  //append a set with set
  println(myset++myset1)
  println(myset.++(myset1))

  //print 1st element of a set
  println(myset.head)

  //print values except 1st element
  println(myset.tail)

  //note: In sets myset(8) means not index 8.Find the value 8.
  println(myset(8))

  //methods in set
  println(myset.&(myset1))   //intersect
  println(myset.intersect(myset1))
  println(myset.max)
  println(myset.isEmpty)



  //iterating through set
  myset.foreach(println)

  for(i<-myset)
    {println(i)}


}
