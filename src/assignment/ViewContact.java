package assignment;

import java.util.ArrayList;

public class ViewContact
{
    public void viewDetail(Person oj)
    {
        System.out.println("First Name: " + oj.getFirstName());
        System.out.println("Last Name: " + oj.getLastName());
        String s = "" + oj.getContactNumbers();
        System.out.println("Contact Number(s): " + s.substring(1, s.length() - 1));
        System.out.println("Email address: " + oj.getEmailAddress());
    }

    public void viewContact(ArrayList<Person> ob)
    {
        if(ob.size()>0)
        {
            for(Person oj: ob)
            {
                viewDetail(oj);
            }
        }
        else
        {
            System.out.println("no contact available");
        }
    }
}
