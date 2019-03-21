package excercise2

object Fibonacci {

  def getFibonacciLoop(nThValue:Int) : Double =
  {
    var prev=1
    var next=0
    var fib=1
    var x=1

    while(x<=nThValue)
    {
      fib=prev+next
      prev=next
      next=fib
    //  println("Fibonacci "+x+": "+fib)
      x=x+1


    }
   return fib
  }

  def getFibonacciRecursion(number:Int) : Double =
  {
    if(number == 1 || number == 2){
      return 1;
    }
    else {
      return getFibonacciRecursion(number - 1) + getFibonacciRecursion(number - 2);
    }

  }

  def main(args: Array[String]): Unit = {
    val result=getFibonacciLoop(6)
    println(result)

    val result1=getFibonacciRecursion(6)
    println(result1)



  }


}
