package com.enriquezrene._05functions

/**
  * Created by rene on 25/01/17.
  */
class Point(var _x: Int, var _y: Int) {

  def move(x: Int, y: Int): Unit = {
    _x += x
    _y += y
  }

  def returnPosition() = {
    s"Point in (${_x}, ${_y})"
  }

}
