package ro.fasttrackit.course5.studentandprofesor;

import java.util.Objects;

public abstract class Student implements Human {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfEnrollment;
    private String facultyName;
    private String specializationName;

    @Override
    public String toString()
    {
        return "Student {" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + "," +
                " dateOfBirth='" + dateOfBirth + '\'' + "," + "dateOfEnrollment='" + dateOfEnrollment + '\'' + "," +
                " facultyName='" + facultyName + '\'' + "," + "specializationName='" + specializationName + '\'' +'}';

    }
    @Override
    public boolean equals (Object o)
    {
        if (this==o) return true;
        if (o==null || getClass () != o.getClass()) return false;
        Student student= (Student) o;
        return Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName)
                && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment)
                && Objects.equals(facultyName, student.facultyName)  && Objects.equals(specializationName, student.specializationName);
    }
  @Override
    public int hashCode ()
  {
      return Objects.hash(lastName,firstName, dateOfBirth, dateOfEnrollment, facultyName, specializationName);
  }

}
