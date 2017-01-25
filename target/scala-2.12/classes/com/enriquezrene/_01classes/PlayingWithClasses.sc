import java.time.LocalDate

import com.enriquezrene._01classes._01SimpleClassCashFlow

// Classes can be instantiated providing parameters in order
val myClass = new _01SimpleClassCashFlow(0, "USD", LocalDate.MIN)

// Or providing parameters in any order by name
val otherClass = new _01SimpleClassCashFlow(currency = "USD", amount = 0, due = LocalDate.MAX)


