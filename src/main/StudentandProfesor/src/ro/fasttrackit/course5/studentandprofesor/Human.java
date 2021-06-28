package ro.fasttrackit.course5.studentandprofesor;

public interface Human
{
    String getFirstName();
    void setFirstName(String firstName);

    String getLastName ();
    void setLastName (String lastName);

    String getDateOfBirth();
    void setDateOfBirth(String dateOfBirth);

    String getDateOfHiring();
    void setDateOfHiring(String dateOfHiring);

    String getSpecializationName();
    void setSpecializationName(String specializationName);

    String getDateOfEnrollment();
    void setDateOfEnrollment(String dateOfEnrollment);

    public String getFacultyName();
    public void setFacultyName(String facultyName);

}
