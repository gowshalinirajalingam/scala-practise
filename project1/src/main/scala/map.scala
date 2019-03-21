object map extends App {

  var mymap:Map[Int,String]=Map(801->"Tom",802->"Jerry",804->"Suri",802->"momy")
  println(mymap)

  //find key
  println(mymap(801))
  println(mymap.contains(801))  //if there is no the specified key in the map mymap(803) shows error.So use  contains which will return boolean value

  //print the keys
  println(mymap.keys)

  //print the values
  println(mymap.values)

  //iterate through map
  mymap.keys.foreach{
    key=>
      print("Key :"+key);
      println("  Value :"+mymap(key))

  }

  var mymap1:Map[Int,String]=Map(804->"jully")
  //note:Map can't have duplicate keys. So if there are more than 1 same key it will take only one.It won't show error.

  //append maps
  println(mymap++mymap1)

  //size of the map
  println(mymap.size)



}
