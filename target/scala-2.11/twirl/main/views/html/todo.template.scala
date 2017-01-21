
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object todo_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class todo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Todo],Form[Todo],play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*6.2*/(tasks: List[Todo], taskForm: Form[Todo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.util.Date

Seq[Any](format.raw/*6.43*/("""


"""),format.raw/*13.3*/("""
"""),format.raw/*15.1*/("""
"""),_display_(/*16.2*/main("TODO LIST")/*16.19*/ {_display_(Seq[Any](format.raw/*16.21*/("""
    """),format.raw/*17.5*/("""<div class="container">
        <div class="page-header" align="center">
            <h1>Life is good!</h1>
        </div>
        <div class="panel-group">
            <div class="panel panel-sample">
                <div class="panel-heading" align="center"><h3>There is <span class="badge">"""),_display_(/*23.93*/tasks/*23.98*/.size),format.raw/*23.103*/("""</span> active task"""),_display_(/*23.123*/if(tasks.size > 1)/*23.141*/{_display_(Seq[Any](format.raw/*23.142*/("""s""")))}),format.raw/*23.144*/("""</h3></div>
                <div class="panel-body">
                    """),_display_(/*25.22*/for(task <- tasks) yield /*25.40*/{_display_(Seq[Any](format.raw/*25.41*/("""
                        """),format.raw/*26.25*/("""<div class="row">
                                """),_display_(/*27.34*/helper/*27.40*/.form(routes.HomeController.deleteTodo(task.id.getOrElse(0)))/*27.101*/ {_display_(Seq[Any](format.raw/*27.103*/("""
                                    """),format.raw/*28.37*/("""<div class="col-sm-1"><button type="submit" class="btn btn-sample btn-sm" >&#10004; Done</button></div>
                                    <div class="bg-sample col-sm-5" align="left" ><h5>"""),_display_(/*29.88*/task/*29.92*/.content),format.raw/*29.100*/("""</h5></div>
                                """)))}),format.raw/*30.34*/("""
                                """),_display_(/*31.34*/helper/*31.40*/.form(routes.HomeController.updateTodo(task.id.getOrElse(0)))/*31.101*/ {_display_(Seq[Any](format.raw/*31.103*/("""
                                    """),format.raw/*32.37*/("""<div class="col-sm-5"><input class="form-control input-xm" placeholder="update" name="content" type="text"></div>
                                    <div class="col-sm-1"><button type="submit" class="btn btn-sample btn-sm" >&#9998; Update</button></div>
                                """)))}),format.raw/*34.34*/("""
                        """),format.raw/*35.25*/("""</div>
                        <div class="row">
                            <div class="col-sm-8 col-md-offset-2"><hr></div>
                        </div>
                    """)))}),format.raw/*39.22*/("""
                    """),format.raw/*40.21*/("""<div class="row">
                        """),_display_(/*41.26*/helper/*41.32*/.form(routes.HomeController.newTodo)/*41.68*/ {_display_(Seq[Any](format.raw/*41.70*/("""
                            """),format.raw/*42.29*/("""<div class="col-sm-11"><input class="form-control input-sm" placeholder="content" name="content" type="text" value="" required></div>
                            <div class="col-sm-1">
                                <button type="submit" class="btn btn-sample btn-sm btn-block  btn-sm"><span class="glyphicon glyphicon-plus"></span></button>
                            </div>
                        """)))}),format.raw/*46.26*/("""
                    """),format.raw/*47.21*/("""</div>
                </div>
                <div class="panel-footer" align="center">
                """),_display_(/*50.18*/(new Date().toString)),format.raw/*50.39*/("""
                """),format.raw/*51.17*/("""</div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(tasks:List[Todo],taskForm:Form[Todo]): play.twirl.api.HtmlFormat.Appendable = apply(tasks,taskForm)

  def f:((List[Todo],Form[Todo]) => play.twirl.api.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)

  def ref: this.type = this

}


}

/*
* This template takes a single argument, a String containing a
* message to display.
*/
object todo extends todo_Scope0.todo
              /*
                  -- GENERATED --
                  DATE: Sat Jan 21 22:49:12 CET 2017
                  SOURCE: C:/Users/Frederic Noyer/CloudStation/HEIG-VD/3eme/POO/Todo/app/views/todo.scala.html
                  HASH: 9d567d1be625131668dcddb3b66ebc4d6b0b41e1
                  MATRIX: 629->98|786->139|819->339|848->365|877->368|903->385|943->387|976->393|1303->693|1317->698|1344->703|1392->723|1420->741|1460->742|1494->744|1597->820|1631->838|1670->839|1724->865|1803->917|1818->923|1889->984|1930->986|1996->1024|2215->1216|2228->1220|2258->1228|2335->1274|2397->1309|2412->1315|2483->1376|2524->1378|2590->1416|2911->1706|2965->1732|3178->1914|3228->1936|3299->1980|3314->1986|3359->2022|3399->2024|3457->2054|3895->2461|3945->2483|4080->2591|4122->2612|4168->2630
                  LINES: 23->6|28->6|31->13|32->15|33->16|33->16|33->16|34->17|40->23|40->23|40->23|40->23|40->23|40->23|40->23|42->25|42->25|42->25|43->26|44->27|44->27|44->27|44->27|45->28|46->29|46->29|46->29|47->30|48->31|48->31|48->31|48->31|49->32|51->34|52->35|56->39|57->40|58->41|58->41|58->41|58->41|59->42|63->46|64->47|67->50|67->50|68->51
                  -- GENERATED --
              */
          