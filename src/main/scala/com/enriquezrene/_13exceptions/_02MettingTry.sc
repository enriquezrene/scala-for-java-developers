import scala.util.{Failure, Success, Try}

val numberOne = "123"
val numberTwo = "12a"

// Success(123)
val numberOneAsInt = Try {
  numberOne.toInt
}

// Failure(NumberFormatException)
val numberTwoAsInt = Try {
  numberTwo.toInt
}


def checkValidTransformation(result: Try[Int]): Unit = {

  result match {
    case Success(n) => println ("Done")
    case Failure(ex) => println ("Invalid")
  }
}

checkValidTransformation(numberOneAsInt)
checkValidTransformation(numberTwoAsInt)