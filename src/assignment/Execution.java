package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution
{
    public static void main(String[] args) {
        ArrayList<Person> ob=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Sid contact directory");
        int num=0;

        while(num!=5)
        {
            System.out.println("Press 1 to add a new contact\n"+
            "Press 2 to view all contacts\n"+
            "Press 3 to search for a contact\n"+
            "Press 4 to delete a contact\n"+
            "Press 5 to exit program\n" );

            int a=sc.nextInt();
            num=a;

            switch(a)
            {
                case 1:
                        AddContact ob1=new AddContact();
                        ob.add(ob1.addContact());
                        num=1;
                        break;
                case 2:
                    ViewContact obj=new ViewContact();
                    obj.viewContact(ob);
                    num=2;
                    break;
                case 3:
                    SearchContact obj1 = new SearchContact();
                    obj1.searchContact(ob);
                    num = 3;
                case 4:
                    DeleteContact obj2 = new DeleteContact();
            }
        }
    }
}
