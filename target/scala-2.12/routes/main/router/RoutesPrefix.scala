
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/decapo/apps/play-slick-basic/conf/routes
// @DATE:Sun Jan 28 20:43:52 CST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
