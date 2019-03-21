//declare a class
class User;

//declare a class with attributes
class User1(private var name:String,val age:Int );

//declare a class with attributes and methods
class User2(private var name:String,val age:Int )
{
  def getname: Unit ={
    println(name)
  }
}

//Here the object is a singleton class object(class can have only one object at a time)
object scala_classes extends App {
  //create object
  var user =new User2("max",22)

  user.getname        //using getter method to get value of name attribute as name is a private variable in User2 class
  println(user.age)   //directly using age variable in User2 class to get the value as age in User2 class is public variable.




}
