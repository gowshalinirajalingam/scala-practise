import Array._
object Array1 extends App {

  val myarray:Array[Int]=new Array[Int](4);
  val myarray2=new Array[String](4)
  val myarray3=Array(1,2,3)

  myarray(0)=10;
  myarray(1)=20;
  myarray(2)=30;
//  myarray(3)=30;

 // println(myarray)
  for (i<-myarray) {
    println(i)
  }

  for (i<-1 to myarray.length-1)
  {
    println(myarray(i))
  }

  for (i<-myarray3)
    {
      println(myarray3)
    }

  //can concatanate same data type array object.
  val result=concat(myarray,myarray)

  for (i<-result)
    {println("hai"+i)}

}
