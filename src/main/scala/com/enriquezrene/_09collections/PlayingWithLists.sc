val daysOfWeek = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

// since lists in scala are immutable you can't add elements
// in an existing list but you have to create a new one
// with all the elements that you want, e.g.

// A new element at the start of the list
val withSaturday = "Saturday" :: daysOfWeek

// A new element at the end of the list
val withSaturdayAtTheEnd = daysOfWeek :+ "Saturday"

// you can also add another list in an existing list
val daysOfWeekend = List("Saturday", "Sunday")

val wholeWeek = daysOfWeek ::: daysOfWeekend

// The first list element
wholeWeek.head
// The whole list without the first element
wholeWeek.tail

val emptyList = List()
val nilList = Nil


def printList[T](list: List[T]): Unit = list match {
  case Nil => println("Nil List")
  // Decompose the list into head and tail
  case h :: t => {
    println(s"$h")
    // Invokes itself with the rest of the list
    printList(t)
  }
}

printList(wholeWeek)
printList(emptyList)
printList(nilList)