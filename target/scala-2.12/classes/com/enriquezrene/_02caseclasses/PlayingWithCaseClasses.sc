import com.enriquezrene._02caseclasses._

// case classes are instantiated without new keyword
val emailNotification = NotificationByEmail(sourceEmail = "my@mail.com", title = "Hello", body = "hey guys")

// fields are public
emailNotification.title

// compilation error, all fields are immutable
// emailNotification.title = "Bye"

// If you wanna change a field value you must create a new object with the required modification
// All no modified fields will have the same value as its original Object
val emailNotificationCopy = emailNotification.copy(title = "Bye")

// Equality is based on field values rather than references
val anotherEmailNotification = NotificationByEmail(sourceEmail = "my@mail.com", title = "Hello", body = "hey guys")
emailNotification == anotherEmailNotification
emailNotification.equals(anotherEmailNotification)



// case class allows to do PatternMatching (switch in java)
val notification: Notification = NotificationBySMS(sourceNumber = "+593999", message = "my sms")

def checkCaseClass(x: Notification): String = x match {
  case NotificationByEmail(_, _, _) => "by email"
  case NotificationBySMS(_, _) => "by sms"
  case NotificationByVoiceRecording(_, _) => "by voice recording"
}

checkCaseClass(notification)
checkCaseClass(emailNotification)

// if guards are available too
val phoneNumber = "+593000"
val notificationFromPhoneNumber = NotificationBySMS(phoneNumber, "my message")

def checkCaseClassWithIfGuards(x: Notification): String = x match {
  case NotificationBySMS(phone, _) if phone == phoneNumber => s"by sms from ${phoneNumber}"
  case NotificationBySMS(_, _) => "by sms from any number"
}

checkCaseClassWithIfGuards(notification)
checkCaseClassWithIfGuards(notificationFromPhoneNumber)