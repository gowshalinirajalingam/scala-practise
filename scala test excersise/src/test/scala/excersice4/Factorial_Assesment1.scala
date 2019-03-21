package excersice4

object Factorial_Assesment1 extends  App {

//linear recursion
def linearRecursion(n: Int):Int={
  if (n <= 1)
    return 1;
  else
    return n * linearRecursion(n -1);

}
  //tail recursion
  def tailRecursion(number: Int) : Int = {
    def factorialWithAccumulator(accumulator: Int, number: Int) : Int = {
      if (number == 1)
        return accumulator
      else
        factorialWithAccumulator(accumulator * number, number - 1)
    }
    factorialWithAccumulator(1, number)
  }
println(linearRecursion(5))
println(tailRecursion(5))
}


