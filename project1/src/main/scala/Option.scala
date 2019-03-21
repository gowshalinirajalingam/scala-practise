object Option extends App {

  //Option type gets 'Some' or  'None'  values
  val lst:List[Int]=List(12,13,14)
  val mp:Map[Int,String]=Map(101->"Tom",102->"John",103->"Kelly")

  //Return type of find method is option
  println(lst.find(_ >12))    //o/p: Some(13)
  println(lst.find(_ >12).get) //get only the value without Some. o/p: 13

  println(mp.get(102))     //o/p: John
  println(mp.get(106))     //o/p: Exception will be thrown
  println(mp.get(106).getOrElse(0))   //o/p:0  Here the exception is handled

  //create object with option type
  val opt:Option[Int]=Some(20)
  println(opt.get)    //o/p:20



}
