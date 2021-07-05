package ro.fasttrackit.course5.studentandprofesor;

import java.util.Objects;

public abstract class Professor implements Human{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String specializationName;
    ProfessorType type;


    @Override
    public String toString()
    {
        return "Student {" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + "," +
                " dateOfBirth='" + dateOfBirth + '\'' + "," + "dateOfEnrollment='" + dateOfHiring + '\'' + "," +
                 "," + "specializationName='" + specializationName + '\'' +'}';

    }
    @Override
    public boolean equals (Object o)
    {
        if (this==o) return true;
        if (o==null || getClass () != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(lastName, professor.lastName) && Objects.equals(firstName, professor.firstName)
                && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring)
                && Objects.equals(specializationName, professor.specializationName);
    }
    @Override
    public int hashCode ()
    {
        return Objects.hash(lastName,firstName, dateOfBirth, dateOfHiring, specializationName);
    }

    @Override
    public ScolarType getType (){
        return type;
    }
}
