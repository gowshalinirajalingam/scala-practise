
object if_else extends App{
    val x=0
    var res:String=_

    if (x==0)
      res="val is zero"
    else
      res="val is not zero"

  println(res)

  val res2=if (x==0) "val is zero" else "val is not zero"
  println(res2)
}
