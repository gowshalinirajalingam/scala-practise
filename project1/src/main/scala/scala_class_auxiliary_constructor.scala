class User11(private var name:String,var age:Int )
{
  def this()
  {
    this("Shalu",23)
  }

  def this(name:String)
  {
    this(name,12)
  }

}

object scala_class_auxiliary_constructor extends App{
  var user1=new User11("Tom",32)
  var user2=new User11()
  var user3=new User11("Sai")

  println(user3.age)
}
