package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import HelloWorld._

object HelloWorld {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[scalatest])
    }
}
@Controller
@EnableAutoConfiguration
class scalatest {
  @RequestMapping(Array("/"))
  @ResponseBody
  def home(): String = "Hello World!"
 
}