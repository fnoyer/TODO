
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

    """),format.raw/*18.5*/("""<div class="container">
        <h1>"""),_display_(/*19.14*/(new Date().toString)),format.raw/*19.35*/("""</h1>
        <div class="panel-group">
            <div class="panel panel-sample">
                <div class="panel-heading" align="center"><h3>There is <span class="badge">"""),_display_(/*22.93*/tasks/*22.98*/.size),format.raw/*22.103*/("""</span> task"""),_display_(/*22.116*/if(tasks.size > 1)/*22.134*/{_display_(Seq[Any](format.raw/*22.135*/("""s""")))}),format.raw/*22.137*/(""" """),format.raw/*22.138*/("""on the pipe!</h3></div>
                <div class="panel-body">
                    """),_display_(/*24.22*/for(task <- tasks) yield /*24.40*/{_display_(Seq[Any](format.raw/*24.41*/("""
                        """),format.raw/*25.25*/("""<div class="row">
                                """),_display_(/*26.34*/helper/*26.40*/.form(routes.HomeController.deleteTodo(task.id.getOrElse(0)))/*26.101*/ {_display_(Seq[Any](format.raw/*26.103*/("""
                                    """),format.raw/*27.37*/("""<div class="col-sm-1"><button type="submit" class="btn btn-sample btn-sm" >&#10004; Done</button></div>
                                    <div class="bg-sample col-sm-5" align="left" ><h5>"""),_display_(/*28.88*/task/*28.92*/.content),format.raw/*28.100*/("""</h5></div>
                                """)))}),format.raw/*29.34*/("""
                                """),_display_(/*30.34*/helper/*30.40*/.form(routes.HomeController.updateTodo(task.id.getOrElse(0)))/*30.101*/ {_display_(Seq[Any](format.raw/*30.103*/("""
                                    """),format.raw/*31.37*/("""<div class="col-sm-5"><input class="form-control input-xm" placeholder="update" name="content" type="text"></div>
                                    <div class="col-sm-1"><button type="submit" class="btn btn-sample btn-sm" >&#9998; Update</button></div>
                                """)))}),format.raw/*33.34*/("""
                        """),format.raw/*34.25*/("""</div>
                        <div class="row">
                            <div class="col-sm-8 col-md-offset-2"><hr></div>
                        </div>
                    """)))}),format.raw/*38.22*/("""
                    """),format.raw/*39.21*/("""<div class="row">
                        """),_display_(/*40.26*/helper/*40.32*/.form(routes.HomeController.newTodo)/*40.68*/ {_display_(Seq[Any](format.raw/*40.70*/("""
                            """),format.raw/*41.29*/("""<div class="col-sm-11"><input class="form-control input-sm" placeholder="content" name="content" type="text" value="" required></div>
                            <div class="col-sm-1">
                                <button type="submit" class="btn btn-sample btn-sm btn-block  btn-sm"><span class="glyphicon glyphicon-plus"></span></button>
                            </div>
                        """)))}),format.raw/*45.26*/("""
                    """),format.raw/*46.21*/("""</div>
                </div>
                <div class="panel-footer" align="center">
                    Todo List Webb App by Frédéric Noyer @ HEIG-VD 2017
                </div>
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
                  DATE: Fri Jan 20 00:24:12 CET 2017
                  SOURCE: C:/Users/Frederic Noyer/CloudStation/HEIG-VD/3eme/POO/Todo/app/views/todo.scala.html
                  HASH: 22609134db524c0e4247dff9330eb1876427540d
                  MATRIX: 629->98|786->139|819->339|848->365|877->368|903->385|943->387|978->395|1043->433|1085->454|1292->634|1306->639|1333->644|1374->657|1402->675|1442->676|1476->678|1506->679|1621->767|1655->785|1694->786|1748->812|1827->864|1842->870|1913->931|1954->933|2020->971|2239->1163|2252->1167|2282->1175|2359->1221|2421->1256|2436->1262|2507->1323|2548->1325|2614->1363|2935->1653|2989->1679|3202->1861|3252->1883|3323->1927|3338->1933|3383->1969|3423->1971|3481->2001|3919->2408|3969->2430
                  LINES: 23->6|28->6|31->13|32->15|33->16|33->16|33->16|35->18|36->19|36->19|39->22|39->22|39->22|39->22|39->22|39->22|39->22|39->22|41->24|41->24|41->24|42->25|43->26|43->26|43->26|43->26|44->27|45->28|45->28|45->28|46->29|47->30|47->30|47->30|47->30|48->31|50->33|51->34|55->38|56->39|57->40|57->40|57->40|57->40|58->41|62->45|63->46
                  -- GENERATED --
              */
          