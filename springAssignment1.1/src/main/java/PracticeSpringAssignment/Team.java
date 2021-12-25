package PracticeSpringAssignment;
import PracticeSpringAssignment.ProjectDetails.Project;
public class Team implements User
{
    private String TeamName;
    private Integer NumberOfMembers;

    //init and destroy methods
    public void initMethod()
    {
        System.out.println("In Init Method");
    }
    public void destroyMethod()
    {
        System.out.println("In Destroy Method");
    }

    private Project project;

    // Setter Injection


    public String getTeamName()
    {
        return TeamName;
    }


    public void setTeamName(String teamName)
    {
        TeamName = teamName;
    }

    public Integer getNumberOfMembers()
    {
        return NumberOfMembers;
    }

    public void setNumberOfMembers(Integer numberOfMembers)
    {
        NumberOfMembers = numberOfMembers;
    }

    public Team(Project project)
    {
        this.project = project;
    }

    @Override
    public String getName()
    {
        return "team name is";
    }

    @Override
    public String getphone()
    {
        return "team phone number is";
    }

}
