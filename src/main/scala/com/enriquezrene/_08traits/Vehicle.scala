package com.enriquezrene._08traits

/**
  * Created by moe on 2/12/17.
  */
// Java interface
trait Vehicle {

  // abstract method break
  def break

  // it would have an own default implementation like java interfaces has
  def sprint(): Unit ={
    println ("Sprinting...")
  }
}


trait Plane extends Vehicle {

  override def break: Unit = {
    println("A plane breaking")
  }

}

trait Boat extends Vehicle {

  override def break: Unit = {
    println("A boat breaking")
  }

}

trait SailBoat extends Vehicle {
  override def break: Unit = {
    println("A sailboat breaking")
  }
}