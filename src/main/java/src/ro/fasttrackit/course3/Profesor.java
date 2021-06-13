package ro.fasttrackit.course3;

public class Profesor {
    private String lastName;
    private  String firstName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String emailAddress;
    private boolean isPHD;

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName (String firstName)
    {
        this.firstName=firstName;
    }
   public String getDateOfBirth ()
   {
       return dateOfBirth;
   }
   public void setDateOfBirth (String dateOfBirth)
   {
       this.dateOfBirth=dateOfBirth;
   }
   public String getDateOfHiring ()
   {
       return dateOfHiring;
   }
   public void setDateOfHiring(String dateOfHiring)
   {
       this.dateOfHiring=dateOfHiring;
   }
   public String getEmailAddress()
   {
       return emailAddress;
   }
   public void setEmailAddress(String emailAddress)
   {
       this.emailAddress=emailAddress;
   }

   //default constructor for the class Profesor
   public Profesor ()
   {

   }

   //explicit constructor
   public Profesor (String givenLastName, String givenFirstName,String givenDateOfBirth, String givenDateOfHiring,String givenEmailAddress, boolean givenPhd)
   {
       this.lastName=givenLastName;
       this.firstName=givenFirstName;
       this.dateOfBirth=givenDateOfBirth;
       this.dateOfHiring=givenDateOfHiring;
       this.emailAddress=givenEmailAddress;
       this.isPHD=givenPhd;

   }


}
