// Some and None are Option[T]
val someVal = Some(1)
val noneVal = None

// It gets the value (1)
someVal.get

// It throws an exception since none is kind of null
//noneVal.get

// It should be solve using getOrElse, like
println(noneVal.getOrElse(-1))

val quitoCity = Some("Quito")
val noneCity = None


def printCityName(city: Option[String]) {
  println(city.getOrElse("Unknown"))
}

printCityName(quitoCity)
printCityName(noneCity)