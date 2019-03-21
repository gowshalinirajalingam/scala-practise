package excersice4

object pascal_triangle_Assesment2 extends App {

  def computeRow(n: Int ) {
    val counter = 0
    var i = 0
    while ( {
      i < n
    }) { // only output the line if it be the last one
      if (i == n - 1) {
        var j = 0
        while ( {
          j <= i
        }) {
          println(pascalValue(i, j) + " ")

          {
            j += 1;
            j - 1
          }
        }
          println()
      }

      {
        i += 1;
        i - 1
      }
    }
  }
def pascalValue(i:Int,j:Int):Int={


  if (j == 0) {
    return 1;
  } else if (j == i) {
    return 1;
  } else {
    return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
  }
}

computeRow(5)
}
