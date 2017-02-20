// inferred return type
def sayHello(name: String) = s"Hello $name"
sayHello("Rene")

// explicit return type after :
def sayHelloExplicit(name: String) : String = s"Hello $name"
sayHelloExplicit("Rene")

// above examples are not using {} because is unnecessary
def sayHelloWithCurlyBraces(name: String) = {
  s"Hello $name"
}
sayHelloWithCurlyBraces("Rene")

