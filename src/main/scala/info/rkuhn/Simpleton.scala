 /**
  *  Copyright (C) 2009-2011 Typesafe Inc. <http://www.typesafe.com>
  */
package info.rkuhn

import akka.actor._

class Simpleton extends Actor {
  self ! "Hello World!"
  def receive = {
    case s: String => println(s); context.stop(self)
  }
}
