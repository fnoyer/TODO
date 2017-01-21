
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Frederic Noyer/CloudStation/HEIG-VD/3eme/POO/Todo/conf/routes
// @DATE:Fri Jan 20 00:55:25 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def deleteTodo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTodo",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:6
    def todos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.todos",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:10
    def updateTodo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTodo",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/update"})
        }
      """
    )
  
    // @LINE:8
    def newTodo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newTodo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
