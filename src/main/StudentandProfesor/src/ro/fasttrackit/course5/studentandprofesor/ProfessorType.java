package ro.fasttrackit.course5.studentandprofesor;

public enum ProfessorType {
    ASSISTANT("2 year experience"),
    ASSOCIATE("1 year experience"),
    PROFESSOR("10 years experience");

    private String experience;

   ProfessorType (String experience)
   {
       this.experience=experience;
   }

    public String getExperience() {
        return experience;
    }
}
