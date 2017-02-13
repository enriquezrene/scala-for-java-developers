package com.enriquezrene._08traits

/**
  * Created by moe on 2/12/17.
  */
// Java abstract class
trait Vehicle {

  // abstract method break
  def break
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