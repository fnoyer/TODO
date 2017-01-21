
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Frederic Noyer/CloudStation/HEIG-VD/3eme/POO/Todo/conf/routes
// @DATE:Fri Jan 20 00:55:25 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.todos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos""", """controllers.HomeController.todos"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos""", """controllers.HomeController.newTodo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/""" + "$" + """id<[^/]+>/delete""", """controllers.HomeController.deleteTodo(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/""" + "$" + """id<[^/]+>/update""", """controllers.HomeController.updateTodo(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_todos0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_todos0_invoker = createInvoker(
    HomeController_0.todos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "todos",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_todos1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos")))
  )
  private[this] lazy val controllers_HomeController_todos1_invoker = createInvoker(
    HomeController_0.todos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "todos",
      Nil,
      "GET",
      """""",
      this.prefix + """todos"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_newTodo2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos")))
  )
  private[this] lazy val controllers_HomeController_newTodo2_invoker = createInvoker(
    HomeController_0.newTodo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newTodo",
      Nil,
      "POST",
      """""",
      this.prefix + """todos"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_deleteTodo3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_HomeController_deleteTodo3_invoker = createInvoker(
    HomeController_0.deleteTodo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteTodo",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """todos/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_updateTodo4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/"), DynamicPart("id", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_HomeController_updateTodo4_invoker = createInvoker(
    HomeController_0.updateTodo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateTodo",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """todos/""" + "$" + """id<[^/]+>/update"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_todos0_route(params) =>
      call { 
        controllers_HomeController_todos0_invoker.call(HomeController_0.todos)
      }
  
    // @LINE:7
    case controllers_HomeController_todos1_route(params) =>
      call { 
        controllers_HomeController_todos1_invoker.call(HomeController_0.todos)
      }
  
    // @LINE:8
    case controllers_HomeController_newTodo2_route(params) =>
      call { 
        controllers_HomeController_newTodo2_invoker.call(HomeController_0.newTodo)
      }
  
    // @LINE:9
    case controllers_HomeController_deleteTodo3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteTodo3_invoker.call(HomeController_0.deleteTodo(id))
      }
  
    // @LINE:10
    case controllers_HomeController_updateTodo4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTodo4_invoker.call(HomeController_0.updateTodo(id))
      }
  
    // @LINE:13
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
