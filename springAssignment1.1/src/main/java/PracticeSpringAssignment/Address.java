package PracticeSpringAssignment;
import PracticeSpringAssignment.ProjectDetails.Project;

public class Address implements User
{
   private String AddressLine1;
   private String AddressLine2;
   private String City;
   private String State;
   private Integer PinCode;
   //init and destroy methods
    /*public void initMethod()
    {
        System.out.println("In Init Method");
    }
    public void destroyMethod()
    {
        System.out.println("In Destroy Method");
    }*/
    private Project project;

    //Constructor Injection


    public Address(Project project)
    {
        this.project = project;
    }
    @Override
    public String getName()
    {
        return"User Name" ;
    }

    @Override
    public String getphone()
    {
        return "User PhoneNumber";
    }
}
