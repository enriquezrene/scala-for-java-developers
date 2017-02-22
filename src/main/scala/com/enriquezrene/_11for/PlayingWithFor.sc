for (i <- 1 to 5) {
  println(i)
}

val namesAges = Map("Rene" -> 30, "Matt" -> 7, ("Luis", 34))
for ((key, value) <- namesAges) {
  println(s"Name is $key and age is $value")
}

// Appying filters
for ((key, value) <- namesAges if value > 18) {
  println(s"This is an adult, name is $key and age is $value")
}


// Nested for
for (x <- 1 to 4; y <- 5 to 6) {
  println(s"coordinates are: $x $y")
}

// Foreach
(1 to 4).foreach(
  // Iterate and print each element
  x => println(x)
)

val numbers = List(
  List(1, 2, 3),
  List(500, 600),
  List(1200, 1301)
)

// Iterate over a list of list, apply a filter and create a new list
for {
  numberList <- numbers
  itemOfNumberList <- numberList
  if (itemOfNumberList % 2 == 0)
} yield itemOfNumberList * -1

// Same thing with map-and-reduce approach
numbers.flatMap(list => list.filter(item => item % 2 == 0).map(item => item * -1))