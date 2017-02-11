import com.enriquezrene._06constructors.{EighteenEmployee, Employee}

val fullInfo = Employee("Rene", "Enriquez", 30)
fullInfo.getMyInfo()

val noLastName = new Employee("Rene", 30)
noLastName.getMyInfo()

val noNamesProvided = new Employee(30)
noNamesProvided.getMyInfo()

val noAgeProvided = new Employee("Rene", "Enriquez")
noAgeProvided.getMyInfo


// By default all employees will have 18
val eighteenEmployee = EighteenEmployee("Rene", "Enriquez")
eighteenEmployee.getMyInfo

// You can override the default age provided
val eighteenEmployeeWith21 = EighteenEmployee("Rene", "Enriquez", 21)
eighteenEmployeeWith21.getMyInfo