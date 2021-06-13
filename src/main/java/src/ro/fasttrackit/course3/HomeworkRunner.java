package ro.fasttrackit.course3;


public class HomeworkRunner {

    public static void main(String[] args) {
        Profesor myProfessor=new Profesor();
        myProfessor.setFirstName("Bertrand");
        myProfessor.setLastName("Russel");
        myProfessor.setDateOfBirth("18.05.1872");
        myProfessor.setDateOfHiring("25.09.1900");
        System.out.println(myProfessor.getFirstName() + " " + myProfessor.getLastName() + " was born on " + myProfessor.getDateOfBirth() + " and was hired as PHD on " + myProfessor.getDateOfHiring());
      //  System.out.println(myProfessor.getFirstName());
       // Profesor myProfesor=new Profesor(givenLastName:"Bertrand")
    }
}
