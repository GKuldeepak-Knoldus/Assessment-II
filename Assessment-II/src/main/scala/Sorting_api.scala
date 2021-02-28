class Sorting_api {

  // Implementing the QuickSort Algorithm
  def quickSort (Int_Array : Array[Int]) : Array[Int] = {

    if (Int_Array.length <= 1) Int_Array // Check if there's either only one element or empty
    else {
    val pivot_element = Int_Array (Int_Array.length / 2) // Defining the pivot Element
      Array.concat(
        quickSort(Int_Array filter (_ < pivot_element)), // Inserting the elements less than the Pivot values
        Int_Array filter (pivot_element ==), // Inserting the Pivot Values
        quickSort(Int_Array filter (_ > pivot_element))) // Inserting the elements greater than the pivot Values
    }
  }
}