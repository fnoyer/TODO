
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Frederic Noyer/CloudStation/HEIG-VD/3eme/POO/Todo/conf/routes
// @DATE:Fri Jan 20 00:55:25 CET 2017


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
