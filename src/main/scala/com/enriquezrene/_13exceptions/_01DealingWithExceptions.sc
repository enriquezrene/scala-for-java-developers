val numbers = List("1", null, "1a", "23")

for (element <- numbers) {
  try {
    println(element.toInt)
  } catch {
    case e: NumberFormatException => println(s"This is not a number $element")
    case e: Exception => println(s"I have no idea what happened with $element")
  }
}