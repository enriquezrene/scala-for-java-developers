package com.enriquezrene._02caseclasses

/**
  * Created by rene on 24/01/17.
  */
abstract class Notification {

}

// by default all fields are val (immutable), you can use var but is not encouraged
case class NotificationByEmail(sourceEmail: String, title: String, body: String) extends Notification

case class NotificationBySMS(sourceNumber: String, message: String) extends Notification

case class NotificationByVoiceRecording(contactName: String, link: String) extends Notification