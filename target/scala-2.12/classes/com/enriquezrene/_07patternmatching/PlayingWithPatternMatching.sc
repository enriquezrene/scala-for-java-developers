import com.enriquezrene._07patternmatching.Phone

val number = 99

// Works like a java switch
number match {
  case 33 => println("99/3")
  case 66 => println("99-33")
  case 99 => println("A truly 99")
}

// you can have multiple checks
number match {
  case 30 | 60 | 90 => println(s"$number ends in 0")
  case 33 | 63 | 93 => println(s"$number ends in 3")
  case 36 | 66 | 96 => println(s"$number ends in 6")
  case 39 | 69 | 99 => println(s"$number ends in 9")
  case _ => println(s"$number unknown")
}



val iPhone = Phone("iPhone", true)

// You can search for matches and apply restrictions on fields
// this is called Guards
iPhone match {
  case Phone(_, is) if is => println("it is 4g")
  case Phone(_, is) if !is => println("it is 3g")
}

val nokia = Phone("Nokia 5100", false)

nokia match {
  case Phone(_, is) if is => println("it is 4g")
  case Phone(_, is) if !is => println("it is 3g")
}