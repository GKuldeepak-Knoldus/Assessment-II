object Sorting_impl {
  def main(args: Array[String]): Unit = {
    val sorting_api = new Sorting_api
    println("Actual Array " + "(3,-1,4,10,2)")
    val sortedList = sorting_api.quickSort(Array(3,-1,4,10,2)).toList // Converting array to list
    println("Sorted Array " + sortedList)
  }
}
