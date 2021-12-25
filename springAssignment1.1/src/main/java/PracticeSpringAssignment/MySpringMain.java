package PracticeSpringAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringMain
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=context.getBean("MyUser",Team.class);
        System.out.println(user.getName());
        System.out.println(user.getphone());
        System.out.println();




    }
}
