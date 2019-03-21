package excercise3

import java.util.Date
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.Calendar

import scala.collection.mutable



object lamda extends App {
  val data = List(
    ("2017-01-01 00:00:00", 2, 10),
    ("2017-01-01 00:00:01", 7, 20),
    ("2017-01-01 00:00:03", 9, 30),
    ("2017-01-01 00:00:04", 10, 30),
    ("2017-01-01 00:00:05", 12, 30),
    ("2017-01-01 00:00:08", 14, 40),
    ("2017-01-01 00:00:09", 16, 50),
    ("2017-01-01 00:00:10", 18, 40),
    ("2017-01-01 00:00:15", 20, 40),
    ("2017-01-01 00:00:16", 30, 80),
    ("2017-01-01 00:00:17", 31, 90),
    ("2017-01-01 00:00:18", 32, 100),
    ("2017-01-01 00:00:19", 40, 102),
    ("2017-01-01 00:00:20", 44, 105),
    ("2017-01-01 00:00:20", 40, 110),
    ("2017-01-01 00:01:01", 42, 110),
    ("2017-01-01 00:02:00", 43, 550)
  )
//println(data.take(2)++data.drop(3))


  //pass list values
  def filter(rawData: List[(String, Int, Int)]): Seq[(String, Int, Int)] = {
    var ListWithRemovedDuplicate: List[(String, Int, Int)] = null
    var calculatedActualValueofColumns: Seq[(String, Int, Int)] = null

    //Assigning mutable list
    var needtoaddList=mutable.MutableList[(String, Int, Int)] ()

    var addedDate = "2017-01-01 00:00:00"

    for (i <- 0 to rawData.length - 1) {
      var formatt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
      var c = Calendar.getInstance()
      c.setTime((formatt.parse(rawData(i)._1)))
      c.add(Calendar.SECOND, 1)      //add 1 second
      addedDate = formatt.format(c.getTime()) //convert date to string

//      println(rawData(i)._1+" "+rawData(i+1)._1+" "+addedDate)
      try {
              var diff = (formatt.parse(rawData(i + 1)._1).getTime() - formatt.parse(rawData(i)._1).getTime()) / 1000

              //if the next 2 dates are duplicates
              if (diff == 0) {
                    //drop the element which has maximum value in 2nd column
                    if (rawData(i)._2 > rawData(i + 1)._2) {

                      //take will take 0th to (i+1)th elements in list
                      //drop will remove i+2 th element and hold the rest of the elements
                      //++ means join 2 lists
                      ListWithRemovedDuplicate=rawData.take(i+1)++rawData.drop(i + 2)
                    }
                    else {
                      ListWithRemovedDuplicate=rawData.take(i)++rawData.drop(i+1)
                    }
              }

              //if the difference between next 2 dates are greater than 1 add the date(sec) difference number of dates
              if (rawData(i+1)._1!=formatt.format(c.getTime())) {
                for (x <- 1 to diff.toInt-1) {
                    c.setTime((formatt.parse(rawData(i)._1)))
                    c.add(Calendar.SECOND, x.toInt)
//                  println(formatt.format(c.getTime()))
                    needtoaddList+=((formatt.format(c.getTime()), 0, 0))
//                  println("diff: "+diff)
//                  println(needtoaddList)


                }

              }



      }
      catch {
        case e: Exception => ""
      }

    }

    //Remove cumulative values from 2nd and 3rd column and add actual value
    calculatedActualValueofColumns=caluculateActualValue(ListWithRemovedDuplicate)

    return (List(("2017-01-01 00:00:00", 2, 10))++needtoaddList++calculatedActualValueofColumns).sorted


  }

def caluculateActualValue(lst: List[(String, Int, Int)]): Seq[(String, Int, Int)]={
//  lst.map(println(_))
var newlist = mutable.MutableList[(String, Int, Int)]()

  try {
    //push elements to mutable list
    for (i <- 0 to lst.length - 1) {
      newlist += ((lst(i+1)._1,if( lst(i + 1)._2 - lst(i)._2<0){0}else{lst(i + 1)._2 - lst(i)._2}, if( lst(i + 1)._3 - lst(i)._3<0){0}else{lst(i + 1)._3 - lst(i)._3}))
     // println( newlist)

    }
  }
  catch {
    case e: Exception =>   ""   // println(newlist)

  }
  return newlist
}



  var result = filter(data)
  result.map(println(_))


}





























