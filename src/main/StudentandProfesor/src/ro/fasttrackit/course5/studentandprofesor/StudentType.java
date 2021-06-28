package ro.fasttrackit.course5.studentandprofesor;

public enum StudentType {
    BACHELORS("Bachelor"),
    MASTERS("diploma engineer"),
    PHD("doctor");

    private String graduated;

    StudentType (String graduated)
    {
        this.graduated=graduated;
    }
    public String getGraduated ()
    {
        return graduated;
    }
}
