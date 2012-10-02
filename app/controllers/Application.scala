package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    import play.api.Play.current
    import com.typesafe.plugin._

//    System.setProperty("javax.net.ssl.trustStoreType", "jks");
//    System.setProperty("javax.net.ssl.trustStore", "/home/myyk/workspace/mailerApp/conf/keystore")
//    println("?!?!?!?!?!?!?!?!?!" + System.getProperty("javax.net.ssl.trustStore").mkString("((((((((", "", "))))))))"))
    
    val mail = use[MailerPlugin].email
      .setSubject("mailer")
      .addRecipient("Myyk Seok <myyk.seok@gmail.com>")
      .addFrom("Myyk Seok <myyk@egraphs.com>")

    mail.send("Hey Myyk", "<html>I like you.</html>")

    Ok(views.html.index("Your new application is ready. " + System.getProperty("javax.net.ssl.trustStore")))
  }

}