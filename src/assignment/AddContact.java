package assignment;

import java.util.Scanner;

public class AddContact {
    Person ob = new Person();
    ValidInput ob1 = new ValidInput();

    public void addfirstName(String firstname) {
        ob.setFirstName(firstname);
    }

    public void addLastName(String lastname) {
        ob.setLastName(lastname);
    }

    public boolean addNumber(String number) {
        if (ob1.phoneNumber(number)) {
            ob.setContactNumbers(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (ob1.emailAddress(mail)) {
            ob.setEmailAddress(mail);
            return true;
        }
        return false;
    }

    public Person addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add contact choosen by you");
        System.out.println("Enter the first name");
        addfirstName(sc.nextLine());
        System.out.println("Enter the Last name");
        addLastName(sc.nextLine());
        boolean num = true;
        while (num) {
            System.out.println("Contacts:");
            String no = sc.nextLine();
            num = addNumber(no);
            if (!num) {
                System.out.println("Number you entered is wrong");
                num = true;
                continue;
            }
            System.out.println("Want to add another number? (y/n): y");
            char c = (sc.nextLine()).charAt(0);
            if (c == 'y') {
                num = true;
            } else {
                num = false;
            }
        }
        System.out.println("Would you like to add email address? (y/n): y");
        char c = (sc.nextLine()).charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            String mai = sc.nextLine();
            boolean a1 = addEmail(mai);
            while (!a1) {
                System.out.println("invalid email please re-enter");
                System.out.print("Email Address: ");
                a1 = addEmail(sc.nextLine());
                continue;
            }
        }
        return ob;
    }
}
