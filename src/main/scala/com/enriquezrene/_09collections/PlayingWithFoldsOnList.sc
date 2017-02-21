val numbers = List(2, 3, 4, 5)

// Sum 10 + all elements of the list
numbers.foldLeft(10)(
  // lambda function
  // Iterates over each element of the list and sums to the accumulatedValue variable
  (accumulatedValue, nextValueInTheList) => accumulatedValue + nextValueInTheList
)

// If you wanna multiply 2 * all elements of the list
numbers.foldLeft(2)(
  // lambda function
  (accumulatedValue, nextValueInTheList) => accumulatedValue * nextValueInTheList
)

// Concatenating strings
val fullName = List("rene", "enriquez")
fullName.foldLeft("My full name is: ")(
  (concatenatedString, eachString) => concatenatedString + eachString.capitalize
)

fullName.foldRight(" is my full name")(
  (concatenatedString, eachString) => concatenatedString.capitalize + eachString.capitalize
)

