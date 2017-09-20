import generated.studentModels.Student

/**
  * Created by muhammadsiddiqi on 9/19/17.
  */
object MainApp extends App {

  val student =
        Student.newBuilder()
            .setStudentId(1)
            .setFirstName("Muhammad")
            .setLastName("Siddiqi")


  println(s"Id: ${student.getStudentId}, FirstName: ${student.getFirstName}, LastName: ${student.getLastName}")

}
