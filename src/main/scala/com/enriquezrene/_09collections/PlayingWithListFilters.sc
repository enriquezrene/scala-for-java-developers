val numbers = List(1, 2, 3, 4, 5)

// It will get just pair numbers
numbers.filter(element => element % 2 == 0)
// It takes the element one by one and multiply by 2
numbers.map(element => element * 2)

val name = List(
  List("rene"),
  List("enriquez")
)

// from list(list) to list -> flatten
name.flatten
// Takes each string and Capitalize it
name.flatten.map(element => element.capitalize)

val fullInfo = List("rene", "enriquez", 30, 212.0)


// Iterates over each element at the list and gives an
// special treatment depending of each DataType
// If no matches like 212.0 it only ignores that case
fullInfo.collect({
  case element: String => element.capitalize
  case element: Int => element
})