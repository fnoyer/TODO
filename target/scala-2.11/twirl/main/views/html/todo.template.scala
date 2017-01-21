
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
        <div class="page-header"></div>
        <div class="panel-group">
            <div class="panel panel-sample">
                <div class="panel-heading" align="center"><h3>There is <span class="badge">"""),_display_(/*21.93*/tasks/*21.98*/.size),format.raw/*21.103*/("""</span> active task"""),_display_(/*21.123*/if(tasks.size > 1)/*21.141*/{_display_(Seq[Any](format.raw/*21.142*/("""s""")))}),format.raw/*21.144*/("""</h3></div>
                <div class="panel-body">
                    """),_display_(/*23.22*/for(task <- tasks) yield /*23.40*/{_display_(Seq[Any](format.raw/*23.41*/("""
                        """),format.raw/*24.25*/("""<div class="row">
                                """),_display_(/*25.34*/helper/*25.40*/.form(routes.HomeController.deleteTodo(task.id.getOrElse(0)))/*25.101*/ {_display_(Seq[Any](format.raw/*25.103*/("""
                                    """),format.raw/*26.37*/("""<div class="col-sm-1"><button type="submit" class="btn btn-sample btn-sm" >&#10004; Done</button></div>
                                    <div class="bg-sample col-sm-5" align="left" ><h5>"""),_display_(/*27.88*/task/*27.92*/.content),format.raw/*27.100*/("""</h5></div>
                                """)))}),format.raw/*28.34*/("""
                                """),_display_(/*29.34*/helper/*29.40*/.form(routes.HomeController.updateTodo(task.id.getOrElse(0)))/*29.101*/ {_display_(Seq[Any](format.raw/*29.103*/("""
                                    """),format.raw/*30.37*/("""<div class="col-sm-5"><input class="form-control input-xm" placeholder="update" name="content" type="text"></div>
                                    <div class="col-sm-1"><button type="submit" class="btn btn-sample btn-sm" >&#9998; Update</button></div>
                                """)))}),format.raw/*32.34*/("""
                        """),format.raw/*33.25*/("""</div>
                        <div class="row">
                            <div class="col-sm-8 col-md-offset-2"><hr></div>
                        </div>
                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""<div class="row">
                        """),_display_(/*39.26*/helper/*39.32*/.form(routes.HomeController.newTodo)/*39.68*/ {_display_(Seq[Any](format.raw/*39.70*/("""
                            """),format.raw/*40.29*/("""<div class="col-sm-11"><input class="form-control input-sm" placeholder="content" name="content" type="text" value="" required></div>
                            <div class="col-sm-1">
                                <button type="submit" class="btn btn-sample btn-sm btn-block  btn-sm"><span class="glyphicon glyphicon-plus"></span></button>
                            </div>
                        """)))}),format.raw/*44.26*/("""
                    """),format.raw/*45.21*/("""</div>
                </div>
                <div class="panel-footer" align="center">
                """),_display_(/*48.18*/(new Date().toString)),format.raw/*48.39*/("""
                """),format.raw/*49.17*/("""</div>
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
                  DATE: Sat Jan 21 23:12:08 CET 2017
                  SOURCE: C:/Users/Frederic Noyer/CloudStation/HEIG-VD/3eme/POO/Todo/app/views/todo.scala.html
                  HASH: a7af0bf0af439bc59bbba348b521bd049d0620a2
                  MATRIX: 629->98|786->139|819->339|848->365|877->368|903->385|943->387|976->393|1242->632|1256->637|1283->642|1331->662|1359->680|1399->681|1433->683|1536->759|1570->777|1609->778|1663->804|1742->856|1757->862|1828->923|1869->925|1935->963|2154->1155|2167->1159|2197->1167|2274->1213|2336->1248|2351->1254|2422->1315|2463->1317|2529->1355|2850->1645|2904->1671|3117->1853|3167->1875|3238->1919|3253->1925|3298->1961|3338->1963|3396->1993|3834->2400|3884->2422|4019->2530|4061->2551|4107->2569
                  LINES: 23->6|28->6|31->13|32->15|33->16|33->16|33->16|34->17|38->21|38->21|38->21|38->21|38->21|38->21|38->21|40->23|40->23|40->23|41->24|42->25|42->25|42->25|42->25|43->26|44->27|44->27|44->27|45->28|46->29|46->29|46->29|46->29|47->30|49->32|50->33|54->37|55->38|56->39|56->39|56->39|56->39|57->40|61->44|62->45|65->48|65->48|66->49
                  -- GENERATED --
              */
          