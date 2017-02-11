package com.enriquezrene._06constructors

/**
  * Created by moe on 2/10/17.
  */
case class Employee(name: String, lastName: String, age: Integer) {

  def this(name: String, lastName: String) = {
    this(name, lastName, 99)
  }

  def this(name: String, age: Integer) = {
    this(name, "no-provided", age)
  }

  def this(age: Integer) = {
    this("no name provided", "no last name provided", age)
  }

  def getMyInfo() = {
    s"My name is $name $lastName and I'm $age years old"
  }
}


case class EighteenEmployee(name: String, lastName: String, age: Integer = 18) {

  def getMyInfo() = {
    s"My name is $name $lastName and I'm $age years old"
  }
}


