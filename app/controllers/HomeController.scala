package controllers

import javax.inject._

import models.{Todo, TodoService}
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import views._

/**
  * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val messagesApi: MessagesApi)(todoService: TodoService) extends Controller with I18nSupport{

  // The form to create an item
  val todoForm = Form(
  mapping(
    "id" -> ignored(None:Option[Long]),
    "content" -> nonEmptyText
  )(Todo.apply)(Todo.unapply))


  /**
    * This function will call the views with all the actual Todo registered in the Database
    * @return Unit
    */
  def todos = Action { implicit request =>
    Ok(views.html.todo(todoService.all(), todoForm))
  }

  /**
    * This fonction will bind the data with our models and create a new todo via models.todoService
    * once added we call the view via a redirection to Homecontroller.todos
    * @return Unit
    */
  def newTodo = Action { implicit request =>
    todoForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.todo(todoService.all(),formWithErrors)),
      label => {
        todoService.create(label.content)
        Redirect(routes.HomeController.todos)
      }
    )
  }

  /**
    * This function will delete a todo item via a models.todoService function
    * once deleted we call the views via a redirection to Homecontroller.todos
    * @param id the id of the todo that has to be deleted
    * @return Unit
    */
  def deleteTodo(id: Long) = Action {
    todoService.delete(id)
    Redirect(routes.HomeController.todos)
  }

  /**
    * This function will bind the form and update an existindg todo item via a call to models.todoService
    * once updated we call the views via a redirection to HomeController.todos
    * @param id the todo id that has to be updated
    */
  def updateTodo(id: Long) = Action { implicit request =>
    todoForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.todo(todoService.all(), formWithErrors)),
      label => {
        todoService.update(id, label.content)
        Redirect(routes.HomeController.todos)
      }
    )
  }
}
