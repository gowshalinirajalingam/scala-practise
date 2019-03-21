object mapandfilterMethod extends App {

  //map function is used to loop through lists,arrays,map and do processing on those values
  val lst=List(1,2,3,5,8)
  val mymap=Map(854->"Tom",855->"Gerry",856->"Kala")

  //map function with List
  println(lst.map(_*2))
  //or
  println(lst.map(x=>x*2))
  println(lst.map(_+"hai"))
  println(lst.map(x=>"hi"*x))

  //map function with map
  println(mymap.map(_+"hi"))     //it concatenates hi with each tuples in map
  println(mymap.mapValues(x=>x+"hi"))    //it concatenates hi with each tuples values in map


  //map function with array
  println("hello".map(_.toUpper))

  //combine lists
  println(List(List(1,2,5),List(5,4,6)))             //without flatten method o/p:List(List(1, 2, 5), List(5, 4, 6))
  println(List(List(1,2,5),List(5,4,6)).flatten)     //with flatten method o/p:List(1, 2, 5, 5, 4, 6)

  //difference of map method and Flatmap method
  println(lst.map(x=>List(x,x+1)))   //creates list in each iteration inside a list
  println(lst.flatMap(x=>List(x,x+1)))//add processed out put to a list

  //filter method(filter values from the collection)
  println(lst.filter(_>2))
  println(lst.filter(x=>x%2==0))
  println(lst.filter(x=>x%2!=0))

}
