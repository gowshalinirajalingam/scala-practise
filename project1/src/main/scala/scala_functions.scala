import java.util.Date;

object scala_functions extends App{

//function creation
def add(x: Int,y:Int):Int={
   return x+y
}
def sub(x: Int,y:Int):Int={
   x-y
  }
def multiply(x: Int,y:Int):Int=x*y

def division(x: Int,y:Int)=x/y




//object creation
  object Math {
    def squre(i: Int): Int = {
      i * i

    }
  }

      println(add(2,3))        //call function directly
      println(Math.squre(5))   //call function using a object



 // Anonymous function
  var add1=(x:Int,y:Int)=>{x+y}
  println(add1(5,4))

 //partially applied function
  //eg1:
  val sum=(a:Int,b:Int)=>a+b
  val f=sum(50,_:Int)
  println(f(10))

  //eg2:
  def log(date:Date,message:String)={println(date+" "+message)}
  val date=new Date()
  var newlog=log(date,_:String)
  newlog("The message1")
  newlog("The message2")
  newlog("The message3")


}
