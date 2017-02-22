val fullName = List("rene", "enriquez")

// iterates over each element of the list and apply the lambda function so that
// to compute the desired result
fullName.reduce(
  (concatenatedString, element) => concatenatedString + " " + element
)