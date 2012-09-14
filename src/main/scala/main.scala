package sandbox

import ru.circumflex._, core._, web._, freemarker._

class Main extends Router {
  val log = new Logger("sandbox")

  get("/") = ftl("index.ftl")

  get("/hello/:name") = {
    'name := param("name")
    ftl("name.ftl")
  }

}