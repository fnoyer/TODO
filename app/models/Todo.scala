package models

import javax.inject.Inject

import anorm.SqlParser._
import anorm.{~, _}
import play.api.db._

/**
  * Created by Frederic Noyer on 20.12.2016.
  */
case class Todo(id: Option[Long] = None,
                content:String)

@javax.inject.Singleton
class TodoService @Inject() (dbapi: DBApi) {

  private val db = dbapi.database("default")

  // mapping to our case class T o d o
  val simple = {
    get[Option[Long]]("id") ~
      get[String]("content") map {
      case id ~ content =>
        Todo(id, content)
    }
  }

  /**
    * Select the entire content of our table
    * @return Returns the list of todo
    */
  def all(): List[Todo] = { db.withConnection { implicit connection =>
    SQL("select * from tasks").as(simple *)}
  }


  /**
    * Add a new item in our database
    * @param content The content of our todo
    * @return Unit
    */
  def create(content: String) = { db.withConnection { implicit connection =>
    SQL("insert into tasks (content) " +
    "values ({content})").on(
    'content -> content).executeUpdate()
  content}
  }

  /**
    * Delete an entry in our table
    * @param id the entry's id that has to be deleted
    * @return Unit
    */
  def delete(id: Long) = { db.withConnection { implicit connection =>
      SQL("delete from tasks where id = {id}").on(
        'id -> id).executeUpdate()
    }
  }

  /**
    * Update an element in the mysql table
    * @param id the todo's id element that has to be update
    * @param content the content that will replace the mysql table content
    * @return Unit
    */
   def update(id: Long, content: String) = { db.withConnection { implicit connection =>
     SQL("update tasks  set content={content} where id={id}").on(
       'id -> id,
       'content -> content).executeUpdate()
      }
   }
}

