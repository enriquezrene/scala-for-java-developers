// You can set values with arrows ->
// Or with () like Luis, 34
val namesAges = Map("Rene" -> 30, "Matt" -> 7, ("Luis", 34))


val renesAge = namesAges("Rene")

// Exception
//var jonsAge = namesAges("Jon")

// Returns an optional
val possibleJonsAge = namesAges.get("Jon")

// If is not found it returns -1
possibleJonsAge.getOrElse(-1)


val fullNamesAges = namesAges + ("Sam" -> 12, "Mary" -> 41)

val otherGuys = Map("Vera" -> 32, "Dan" -> 39)

val twoMaps = namesAges ++ otherGuys