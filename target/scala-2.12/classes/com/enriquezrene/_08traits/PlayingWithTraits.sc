import com.enriquezrene._08traits.{Boat, Plane, SailBoat}

// A class can implements more than one trait
class SeaPlane extends Boat with Plane {

}


val seaPlane = new SeaPlane

// Takes the plane behaviour, it is overriding the boat implementation
// Why? implements Boat and with Plane
// First takes the boat impl and then takes plane impl
seaPlane.break

// You can create your own implementations on the fly
val sailBoatPlane = new SeaPlane with SailBoat
sailBoatPlane.break
sailBoatPlane.sprint