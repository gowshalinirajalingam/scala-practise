package exerciseThree


class Lambda {
  /**
    * This function is to achieve the following
    * Remove duplicate values and get the maximum value from the duplicates while remove. for example 2017-01-05 has 3 data and 10500 is maximum out of all three in the second column
    * Sort the data
    * Just assume this is accumulated values (from second and third values from each row) and get the actual vales (different between next data and keep the first data as it is)
    * The data is invalid if this is get minus and replace 0 with the invalid data (if the data is smaller than previous)
    * Add missing days
    * Please use Java LocalDateTime for date function
    * Sample input
    * val data = List(
    * ("2017-01-01 00:00:00", 2,10),
    * ("2017-01-01 00:00:01", 7,20),
    * ("2017-01-01 00:00:03", 9,30),
    * ("2017-01-01 00:00:04", 10,30),
    * ("2017-01-01 00:00:05", 12,30),
    * ("2017-01-01 00:00:08", 14,40),
    * ("2017-01-01 00:00:09", 16,50),
    * ("2017-01-01 00:00:10", 18,40),
    * ("2017-01-01 00:00:15", 20,40),
    * ("2017-01-01 00:00:16", 30,80),
    * ("2017-01-01 00:00:17", 31,90),
    * ("2017-01-01 00:00:18", 32,100),
    * ("2017-01-01 00:00:19", 40,102),
    * ("2017-01-01 00:00:20", 40,105),
    * ("2017-01-01 00:00:20", 40,110),
    * ("2017-01-01 00:01:01", 42,110),
    * ("2017-01-01 00:02:00", 43,550)
    * )
    *
    * Conditions
    * 1) Cannot use loops
    * 2) Cannot declare a variable
    * 3) You can split the task into small small functions and one function can have only one line
    *
    * There are the ultimate goal by the function programming but for the learning purpose you can break all the conditions
    * Have a nice day!
    *
    * @param rawData
    * @return
    */
  def filter(rawData:List[(String,Int,Int)]) : Seq[(String,Int,Int)] = ???

}


